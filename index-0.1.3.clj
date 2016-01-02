{:namespaces
 ({:doc "Data generators for Clojure.",
   :author "Stuart Halloway",
   :name "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators/clojure.data.generators-api.html",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "*rnd*",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L18",
   :dynamic true,
   :line 18,
   :var-type "var",
   :doc
   "Random instance for use in generators. By consistently using this\ninstance you can get a repeatable basis for tests.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/*rnd*"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "anything",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L295",
   :line 295,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a scalar or collection based on *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/anything"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "boolean",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L117",
   :line 117,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a bool based on *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/boolean"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "boolean-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/boolean-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "byte",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L112",
   :line 112,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a long based on *rnd* in the byte range.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/byte"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "byte-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/byte-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "char",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L127",
   :line 127,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a character based on *rnd* in the range 0-65536.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/char"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "char-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/char-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "collection",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L289",
   :line 289,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a collection of scalar elements based on *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/collection"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "date",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L257",
   :line 257,
   :var-type "function",
   :arglists ([] [base]),
   :doc
   "Create a date with geoemetric mean around base. Defaults to\n#inst \"2007-10-16T00:00:00.000-00:00\"",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/date"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "default-sizer",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L132",
   :line 132,
   :var-type "function",
   :arglists ([]),
   :doc
   "Default sizer used to run tests. If you want a specific distribution,\ncreate your own and pass it to a fn that wants a sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/default-sizer"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "double",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L57",
   :line 57,
   :var-type "function",
   :arglists ([]),
   :doc "Generate a double between 0 and 1 based on *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/double"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "double-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/double-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "float",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L52",
   :line 52,
   :var-type "function",
   :arglists ([]),
   :doc "Generate af float between 0 and 1 based on *rnd*",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/float"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "float-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/float-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "geometric",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L39",
   :line 39,
   :var-type "function",
   :arglists ([p]),
   :doc "Geometric distribution with mean 1/p.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/geometric"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "hash-map",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L199",
   :line 199,
   :var-type "function",
   :arglists ([fk fv] [fk fv sizer]),
   :doc
   "Create a hash-map with keys from fk, vals from fv, and\nsized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/hash-map"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "int-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/int-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "keyword",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L247",
   :line 247,
   :var-type "function",
   :arglists ([] [sizer]),
   :doc "Create a non-namespaced keyword sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/keyword"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "list",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L138",
   :line 138,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create a list with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/list"}
  {:name "long",
   :doc "Returns a long based on *rnd*. Same as uniform.",
   :var-type "var",
   :line 92,
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/long",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L92",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "long-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/long-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "one-of",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L87",
   :line 87,
   :var-type "function",
   :arglists ([& specs]),
   :doc
   "Generates one of the specs passed in, with equal probability.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/one-of"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "printable-ascii-char",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L122",
   :line 122,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a char based on *rnd* in the printable ascii range.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/printable-ascii-char"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "rand-nth",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L62",
   :line 62,
   :var-type "function",
   :arglists ([coll]),
   :doc
   "Replacement of core/rand-nth that allows control of the\nrandomization basis (through binding *rnd*).",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/rand-nth"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "ratio",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L96",
   :line 96,
   :var-type "function",
   :arglists ([] [num-gen denom-gen]),
   :doc
   "Generate a ratio, with numerator and denominator uniform longs\nor as specified",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/ratio"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "reps",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L31",
   :line 31,
   :var-type "function",
   :arglists ([sizer f]),
   :doc "Returns sizer repetitions of f (or (f) if f is a fn).",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/reps"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "reservoir-sample",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L320",
   :line 320,
   :var-type "function",
   :arglists ([ct coll]),
   :doc "Reservoir sample ct items from coll, using *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/reservoir-sample"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "scalar",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L279",
   :line 279,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a scalar based on *rnd*.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/scalar"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "set",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L193",
   :line 193,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create a set with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/set"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "short-array",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :line 163,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create an array with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/short-array"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "shuffle",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L313",
   :line 313,
   :var-type "function",
   :arglists ([coll]),
   :doc "Shuffle coll based on *rnd*",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/shuffle"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "string",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L208",
   :line 208,
   :var-type "function",
   :arglists ([] [f] [f sizer]),
   :doc "Create a string with chars from v and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/string"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "symbol",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L242",
   :line 242,
   :var-type "function",
   :arglists ([] [sizer]),
   :doc "Create a non-namepsaced symbol sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/symbol"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "tuple",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([& generators]),
   :doc "Generate a tuple with one element from each generator.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/tuple"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "uniform",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L45",
   :line 45,
   :var-type "function",
   :arglists ([] [lo hi]),
   :doc
   "Uniform distribution from lo (inclusive) to high (exclusive).\nDefaults to range of Java long.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/uniform"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "uuid",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L252",
   :line 252,
   :var-type "function",
   :arglists ([]),
   :doc
   "Create a UUID based on uniform distribution of low and high parts.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/uuid"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "vec",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L187",
   :line 187,
   :var-type "function",
   :arglists ([f] [f sizer]),
   :doc "Create a vec with elements from f and sized from sizer.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/vec"}
  {:raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :name "weighted",
   :file "src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L73",
   :line 73,
   :var-type "function",
   :arglists ([m]),
   :doc
   "Given a map of generators and weights, return a value from one of\nthe generators, selecting generator based on weights.",
   :namespace "clojure.data.generators",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/weighted"})}
