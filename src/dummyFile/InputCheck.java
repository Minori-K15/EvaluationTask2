package dummyFile;

class InputCheck {

	private String str;
	// 2) インスタンス変数に値を設定するように修正
	public InputCheck(String str) {
		if(str == null) {
			// 2) 修正前：str = "";
			this.str = "";
		}
		// 2) 修正前：str = str;
		this.str = str;
	}

	protected boolean isNumeric()
	{
		/*
		 * 3) 文字列の比較なので比較演算子が違う
		 * == ではなく、equalsに修正
		 * 
		 * 修正前：if (this.str == "") {
		 * */
		if (this.str.equals("")) { // 3) 修正後
			return false;
		}

		for (int i = 0; i < this.str.length(); i++)
		{
			char c = this.str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	protected boolean checkSize() {
		if(this.str.length() <= 10) {
			if(Math.abs(Integer.parseInt(this.str)) <= 1024*1024*100) {
				return true;
			}
			return false;
		}
		else {
			return false;
		}
	}
}