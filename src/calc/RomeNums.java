package calc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomeNums {
    I(1), IV(4),V(5),IX(9),X(10),
    XL(40),L(50),XC(90),C(100),
    CD(400),D(500),CM(900),M(1000);

    private final int curr;

    RomeNums(int curr) {
        this.curr = curr;
    }

    public int getCurr() {
        return curr;
    }

    public static List<RomeNums> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomeNums e) -> e.curr).reversed())
                .collect(Collectors.toList());
    }
}