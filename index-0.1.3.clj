{:namespaces
 ({:source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators/clojure.data.generators-api.html",
   :name "clojure.data.generators",
   :author "Stuart Halloway",
   :doc "Data generators for Clojure."}),
 :vars
 ({:name "*rnd*",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L18",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/*rnd*",
   :doc
   "Random instance for use in generators. By consistently using this\ninstance you can get a repeatable basis for tests.",
   :var-type "var",
   :line 18,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "anything",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L295",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/anything",
   :doc "Returns a scalar or collection based on *rnd*.",
   :var-type "function",
   :line 295,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "boolean",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L117",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/boolean",
   :doc "Returns a bool based on *rnd*.",
   :var-type "function",
   :line 117,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "boolean-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/boolean-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "byte",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L112",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/byte",
   :doc "Returns a long based on *rnd* in the byte range.",
   :var-type "function",
   :line 112,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "byte-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/byte-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "char",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L127",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/char",
   :doc "Returns a character based on *rnd* in the range 0-65536.",
   :var-type "function",
   :line 127,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "char-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/char-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "collection",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L289",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/collection",
   :doc "Returns a collection of scalar elements based on *rnd*.",
   :var-type "function",
   :line 289,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [base]),
   :name "date",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L257",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/date",
   :doc
   "Create a date with geoemetric mean around base. Defaults to\n#inst \"2007-10-16T00:00:00.000-00:00\"",
   :var-type "function",
   :line 257,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "default-sizer",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L132",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/default-sizer",
   :doc
   "Default sizer used to run tests. If you want a specific distribution,\ncreate your own and pass it to a fn that wants a sizer.",
   :var-type "function",
   :line 132,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "double",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L57",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/double",
   :doc "Generate a double between 0 and 1 based on *rnd*.",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "double-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/double-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "float",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L52",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/float",
   :doc "Generate af float between 0 and 1 based on *rnd*",
   :var-type "function",
   :line 52,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "float-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/float-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([p]),
   :name "geometric",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L39",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/geometric",
   :doc "Geometric distribution with mean 1/p.",
   :var-type "function",
   :line 39,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([fk fv] [fk fv sizer]),
   :name "hash-map",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L199",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/hash-map",
   :doc
   "Create a hash-map with keys from fk, vals from fv, and\nsized from sizer.",
   :var-type "function",
   :line 199,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "int-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/int-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [sizer]),
   :name "keyword",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L247",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/keyword",
   :doc "Create a non-namespaced keyword sized from sizer.",
   :var-type "function",
   :line 247,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "list",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L138",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/list",
   :doc "Create a list with elements from f and sized from sizer.",
   :var-type "function",
   :line 138,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:file "src/main/clojure/clojure/data/generators.clj",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L92",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/long",
   :namespace "clojure.data.generators",
   :line 92,
   :var-type "var",
   :doc "Returns a long based on *rnd*. Same as uniform.",
   :name "long"}
  {:arglists ([f] [f sizer]),
   :name "long-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/long-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([& specs]),
   :name "one-of",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L87",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/one-of",
   :doc
   "Generates one of the specs passed in, with equal probability.",
   :var-type "function",
   :line 87,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "printable-ascii-char",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L122",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/printable-ascii-char",
   :doc "Returns a char based on *rnd* in the printable ascii range.",
   :var-type "function",
   :line 122,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([coll]),
   :name "rand-nth",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L62",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/rand-nth",
   :doc
   "Replacement of core/rand-nth that allows control of the\nrandomization basis (through binding *rnd*).",
   :var-type "function",
   :line 62,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [num-gen denom-gen]),
   :name "ratio",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L96",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/ratio",
   :doc
   "Generate a ratio, with numerator and denominator uniform longs\nor as specified",
   :var-type "function",
   :line 96,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([sizer f]),
   :name "reps",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L31",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/reps",
   :doc "Returns sizer repetitions of f (or (f) if f is a fn).",
   :var-type "function",
   :line 31,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([ct coll]),
   :name "reservoir-sample",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L320",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/reservoir-sample",
   :doc "Reservoir sample ct items from coll, using *rnd*.",
   :var-type "function",
   :line 320,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "scalar",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L279",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/scalar",
   :doc "Returns a scalar based on *rnd*.",
   :var-type "function",
   :line 279,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "set",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L193",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/set",
   :doc "Create a set with elements from f and sized from sizer.",
   :var-type "function",
   :line 193,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "short-array",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L163",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/short-array",
   :doc "Create an array with elements from f and sized from sizer.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([coll]),
   :name "shuffle",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L313",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/shuffle",
   :doc "Shuffle coll based on *rnd*",
   :var-type "function",
   :line 313,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [f] [f sizer]),
   :name "string",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L208",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/string",
   :doc "Create a string with chars from v and sized from sizer.",
   :var-type "function",
   :line 208,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [sizer]),
   :name "symbol",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L242",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/symbol",
   :doc "Create a non-namepsaced symbol sized from sizer.",
   :var-type "function",
   :line 242,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([& generators]),
   :name "tuple",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L68",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/tuple",
   :doc "Generate a tuple with one element from each generator.",
   :var-type "function",
   :line 68,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([] [lo hi]),
   :name "uniform",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L45",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/uniform",
   :doc
   "Uniform distribution from lo (inclusive) to high (exclusive).\nDefaults to range of Java long.",
   :var-type "function",
   :line 45,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([]),
   :name "uuid",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L252",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/uuid",
   :doc
   "Create a UUID based on uniform distribution of low and high parts.",
   :var-type "function",
   :line 252,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([f] [f sizer]),
   :name "vec",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L187",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/vec",
   :doc "Create a vec with elements from f and sized from sizer.",
   :var-type "function",
   :line 187,
   :file "src/main/clojure/clojure/data/generators.clj"}
  {:arglists ([m]),
   :name "weighted",
   :namespace "clojure.data.generators",
   :source-url
   "https://github.com/clojure/data.generators/blob/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj#L73",
   :raw-source-url
   "https://github.com/clojure/data.generators/raw/bf2eb5288fb59045041aec01628a7f53104d84ca/src/main/clojure/clojure/data/generators.clj",
   :wiki-url
   "http://clojure.github.com/data.generators//clojure.data.generators-api.html#clojure.data.generators/weighted",
   :doc
   "Given a map of generators and weights, return a value from one of\nthe generators, selecting generator based on weights.",
   :var-type "function",
   :line 73,
   :file "src/main/clojure/clojure/data/generators.clj"})}
