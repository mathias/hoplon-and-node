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

Compile the Hoplon pages with:

```bash
boot development
```

Now you should be able to load http://localhost:3000 and see the example app!

## License

Copyright © 2014 Matt Gauger

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
