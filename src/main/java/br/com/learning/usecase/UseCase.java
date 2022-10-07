package br.com.learning.usecase;

public interface UseCase<TIn, TOut> {
    TOut execute(TIn parameter);
}
