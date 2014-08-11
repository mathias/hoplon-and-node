# hoplon-and-node

A demo of a Hoplon page being served by a ClojureScript node app.

## Usage

### Node server

Install the node dependencies:

```bash
npm install
```

Compile the ClojureScript for the node app with:

```bash
lein cljsbuild once
```

Now run the node app:

```bash
node src/js/node.js
```

### Hoplon page

## License

Copyright © 2014 Matt Gauger

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
