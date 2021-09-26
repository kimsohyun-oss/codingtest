package test.fifth.pond;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pond {
    public List<Integer> calculate() {

        String pond = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 0 0 0 1 1 1 1 1 1 1 1 0 0 1 1 1 1 1 1 1 1 0 0 0 1 1 1 1 1 1 0 0 0 0 0 1 1 1 1 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";
        Integer[] integers = Arrays.stream(pond.split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        LinkedList<Integer> list = new LinkedList(Arrays.asList(integers));

        for (int j = 0; j < 5; j++) {

            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);

                // seq : 셀번호
                int seq = i + 1;

                if (num == 0) {
                    continue;
                }

                // 첫번째 행일때
                if (seq <= 10) {
                    Integer plus10 = list.get(i + 10);
                    Integer plus1 = list.get(i + 1);

                    // 첫번째 행의 첫번째 셀
                    if (seq == 1) {
                        if (num <= plus10 && num <= plus1) {
                            list.set(i, num + 1);
                        }
                        continue;
                    }

                    // 첫번째 행의 마지막 셀
                    Integer minus1 = list.get(i - 1);
                    if (seq == 10) {
                        if (num <= plus10 && num <= minus1) {
                            list.set(i, num + 1);
                        }
                        continue;
                    }

                    if (num <= plus10 && num <= plus1 && num <= minus1) {
                        list.set(i, num + 1);
                    }
                    continue;
                }

                // 첫번째 열일때
                if (seq - 1 % 10 == 0) {
                    Integer plus10 = list.get(i + 10);
                    Integer plus1 = list.get(i + 1);
                    Integer minus1 = list.get(i - 1);
                    if (num <= plus10 && num <= plus1 && num <= minus1) {
                        list.set(i, num + 1);
                    }
                    continue;
                }


                // 마지막 열일때
                if (seq % 10 == 0) {
                    Integer plus10 = list.get(i + 10);
                    Integer minus10 = list.get(i - 10);
                    Integer minus1 = list.get(i - 1);
                    if (num <= plus10 && num <= minus10 && num <= minus1) {
                        list.set(i, num + 1);
                    }
                    continue;
                }

                // 마지막 행일떄
                if (seq >= list.size() - 10) {
                    Integer minus10 = list.get(i - 10);
                    Integer minus1 = list.get(i - 1);

                    // 마지막 행의 마지막 셀
                    if (seq == list.size()) {
                        if (num <= minus1 && num <= minus10) {
                            list.set(i, num + 1);
                        }
                        continue;
                    }

                    // 마지막 행의 첫번째 셀
                    Integer plus1 = list.get(i + 1);
                    if (seq == list.size() - 9) {
                        if (num <= plus1 && num <= minus10) {
                            list.set(i, num + 1);
                        }
                        continue;
                    }

                    if (num <= minus10 && num <= plus1 && num <= minus1) {
                        list.set(i, num + 1);
                    }
                    continue;
                }

                Integer plus10 = list.get(i + 10);
                Integer minus10 = list.get(i - 10);
                Integer plus1 = list.get(i + 1);
                Integer minus1 = list.get(i - 1);
                if (num <= plus10&& num <= minus10 && num <= plus1 && num <= minus1) {
                    list.set(i, num + 1);
                }
            }

        }

        return list;
    }
}
