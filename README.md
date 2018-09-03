# Run the function app

1. Install the latest Functions V2 runtime (Beta 37 and up).
1. Install extensions
    ```
    func extensions install
    ```
1. Create a `local.settings.json` using the sample, enter a valid SignalR Service connection string.
1. Compile and run
    ```
    mvn package && func start
    ```
# Run the UI

1. Start a web server to run serve `index.html` over HTTP. If Python is installed:
    ```
    python -m SimpleHTTPServer
    ```


