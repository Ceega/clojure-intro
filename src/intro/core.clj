(ns intro.core)

;; First of all, this is a comment. There are other ways to comment code,
;; but this is the common line comment similar to other languages.

;; The code above is how a namepace is defined. Namespaces must follow the
;; directory structure. In this case: intro/core.clj => intro.core.
;; By default, the contents of src/ directory next to deps.edn are added into
;; source paths, so src/ directory is omitted from the namespace. Ns form is
;; also used for requiring namespaces and importing Java classes.

;; Import clojure.string under alias str.

;;
;; Data types, structures and literals.
;;

;; This section presents the bread and butter of data types in Clojure. While
;; learning, it can be helpful to use a form (type :something) to see the type
;; of the expression.

;; Nil is similar to null and is more of a value instead of a type.

;; Numbers (Longs, Doubles, Ratios, BigInts, BigDecimals).

;; Strings. Here Clojure relies on the underlying platform directly so remember
;; to beware NullPointerExceptions. Normally Clojure is actually quite nil safe.

;; Characters. Again, Clojure Characters are Java Characters.

;; Keywords. For symbolic identifiers and fast equality tests.

;; Symbols. Identifiers that refer to something else. Used as bindings for
;; example in function arguments. Handling symbols directly is rarely needed as
;; they are more of a metaprogramming tool.

;; Below are some collections. Collections have both literals and functions for
;; creating them.

;; Lists.

;; Vectors.

;; Maps.

;; Sets.

;; All of the above form most of the syntax in Clojure. What is missing is
;; essentially some reader macros. Now the real mind bending begins when we see
;; what happens when a list without quote is evaluated...

;;
;; Calling functions: a list will evaluate to a function call. The first element
;; of the list will be called as a function while the rest of the elements will
;; be given to it as its arguments. The quote used above actually just prevents
;; evaluating the list as a function call.
;;

;; When functions are called (and then parens are evaluated), the outer parens
;; don't see the contents of inner parens. For example:
;; (+ 3 (* 2 4)) <= the sum function sees numbers 3 and 8 but not (* 2 4).
;; There are exceptions to this rule (macros and special forms).

;; Some important core functions for manipulating data structures.

;; Keywords, sets and maps implement IFn, so they can be called as functions.

;; Defining constants

;; Why are we suddenly interested in constants? To show that values are truly
;; immutable in Clojure. Now, after defining a constant, try associng some data
;; to that. Then evaluate the constant again. Don't be fooled by how functions
;; are named in Clojure! There's also no need to worry about efficiency as these
;; immutable persistant data structures actually share memory behind the scenes.

;; Things that have special syntax in other languages, such as arithmetics or
;; if-else are not that special in Clojure.

;;
;; A few important macros and special forms that often have special syntax in
;; other languages.
;;

;; Cond: similar to if-else.

;; Let: bindings inside lexical scope.

;; For: list comprehension. It's important to realize that for is not a loop,
;; because it returns a lazy sequence.

;; Try-catch

;; Defn: defining functions.

;; Lambdas AKA anonymous functions (with fn and with a reader macro).

;; Threading macros. Pass values from one form to another. Code often becomes
;; more beautiful when using these.

;;
;; Destructuring; a way to bind symbols to the contents of data structures.
;; Destructuring can be used in all places where there are bindings such
;; as function arguments, let, for, etc.

;; Sequences.

;; Maps.

;;
;; Java / Javascript interop.
;;

;; Accessing fields.

;; Calling methods.

;; Constructors.

;;
;; Shared state; Atoms.
;;

;;
;; Now let's move on to netflix.clj.
;;
