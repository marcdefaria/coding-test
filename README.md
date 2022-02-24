Imagine you're pairing with a junior dev and have been tasked with the following.  Your pair (the interviewer) will also
act as product owner, so you can ask any questions to clarify requirements.

The exercise is timeboxed; assessment is based not on completing the test in time, but on how you approach the problem
when pairing.  Consider this as if each requirement below was a separate ticketed business requirement, and you were
implementing production-quality code accordingly.

1) Count files in directory tree.  Example expected results, using command-line utils that perform the same function: 

    $ find src/test/resources/filecount-simple -type f | wc -l
    2

    $ find src/test/resources/filecount-complex -type f | wc -l
    12

    $ find src/test/resources/minions -type f | wc -l
    62

2) Count lines in directory tree.  Example expected results:

    $ find src/test/resources/filecount-simple -type f -exec cat {} + | wc -l
    12

    $ find src/test/resources/filecount-complex -type f -exec cat {} + | wc -l
    16

    $ find src/test/resources/minions -type f -exec cat {} + | wc -l
    4034

3) Count code/whitespace/comments of Java code in directory tree.  Example expected results:

    $ cloc src/test/resources/minions
    -------------------------------------------------------------------------------
    Language                     files          blank        comment           code
    -------------------------------------------------------------------------------
    Java                            39            435            255           1978

4) Count code/whitespace/comments for given languages in directory tree
