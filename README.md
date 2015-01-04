I tried updating my test.check version from 0.5.8 but now my tests run about five times slower.
Here's an initial rudimentary attempt to demonstrate that it's happening.
The problem seems to be one of my generators:
`(def simple-map-gen (gen/map gen/keyword gen/int))`

```
$ time lein with-profiles good test

lein test testcheckperf.core-test
{:test-var merge-count, :result true, :num-tests 100, :seed 1420337555809}

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

real	0m6.802s
user	0m12.791s
sys	0m0.615s

$ time lein with-profiles bad test

lein test testcheckperf.core-test
{:test-var merge-count, :result true, :num-tests 100, :seed 1420337628942}

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

real	0m29.254s
user	1m11.555s
sys	0m0.967s

$ time lein with-profiles still-bad test

lein test testcheckperf.core-test
{:test-var "merge-count", :result true, :num-tests 100, :seed 1420337718437}

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

real	0m30.646s
user	1m22.471s
sys	0m1.101s
```
