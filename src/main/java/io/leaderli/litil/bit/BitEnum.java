package io.leaderli.litil.bit;

/**
 * @author leaderli
 * @since 2022/1/28
 */
public enum BitEnum {

    B1(0),
    B2(1),
    B3(2),
    B4(3),
    B5(4),
    B6(5),
    B7(6),
    B8(7),
    B9(8),
    B10(9),
    B11(10),
    B12(11),
    B13(12),
    B14(13),
    B15(14),
    B16(15),
    B17(16),
    B18(17),
    B19(18),
    B20(19),
    B21(20),
    B22(21),
    B23(22),
    B24(23),
    B25(24),
    B26(25),
    B27(26),
    B28(27),
    B29(28),
    B30(29),
    B31(30),
    B32(30);


    final int value;
    final int length;

    BitEnum(int length) {
        this.length = length;
        this.value = 1 << length;
    }


}
