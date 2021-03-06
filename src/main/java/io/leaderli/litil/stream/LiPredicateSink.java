package io.leaderli.litil.stream;

import java.util.function.Predicate;

public class LiPredicateSink<T> extends LiSink<T, Boolean> {

    public static final boolean NO_NOT_OPERATION = false;
    public static final boolean IS_NOT_OPERATION = true;
    private final Predicate<T> predicate;

    public LiPredicateSink(LiSink<T, java.lang.Boolean> prev, Predicate<T> predicate) {
        super(prev);
        this.predicate = predicate;
    }


    /**
     * @param notOperation 标记是否前面为not操作符，如果是not，则predicate的值取反
     */
    @Override
    public Boolean apply(T request, Boolean notOperation) {
        boolean apply = predicate.test(request);
        apply = notOperation != apply;
        return next(request, apply);
    }
}
