package kr.cbnu.lesson8;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 해당 파일은 간단한 파일 읽기를 구현하는 문제입니다.
 * <p>
 * 해당 문제는 다음을 충족해야 합니다 :
 *  - {@link FileReadExample#readFileOrNull(File)}을 구현하여 주어진 파일을 읽어 {@link List<String>}으로 반환해야 합니다.
 * <p>
 * 해당 문제는 다음의 제약 조건을 가집니다 :
 *  - {@link FileReadExample#readFileOrNull(File)} 메서드만 수정할 수 있습니다.
 *  - {@link FileSaveExample#saveFile(File, List)}에서 저장한 파일을 읽어와야 합니다.
 *  - 파일이 존재하지 않는 경우, null을 반환해야 합니다.
 */
public class FileReadExample {
    public static void main(String[] args) {
        try {
            System.out.println(readFileOrNull(new File("test.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFileOrNull(File f) throws IOException {
        throw new RuntimeException("이곳에서 코드를 구현하십시오.");
    }
}
