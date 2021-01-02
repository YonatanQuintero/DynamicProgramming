import java.util.Map;

public class FibMemoization {


    public Long fib(Long n) {
        if (n <= 2) return 1L;
        return fib(n - 1) + fib(n - 2);
    }

    public Long fib(Long n, Map<Long, Long> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1L;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }
}
