/*
 * 1）パッケージ名の誤り
 * 宣言されているpackage名ではなく、クラス名を定義していたので修正
 * 
 * 修正前： package DummyFile;
 * */
package dummyFile; // １）修正後

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class CreateFile {

	protected static boolean createDummyFile(int byteSize)
	{
		File file = new File("./DummyFile");
		file.delete();
		try(RandomAccessFile rFile = new RandomAccessFile(file.getPath(), "rw")){
			rFile.setLength(byteSize);
			rFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

