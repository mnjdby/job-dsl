job('example-1') {
    steps {
        shell('echo Hello World!')
    }
}

// read file from workspace
job('example-2') {
    steps {
        shell('echo Hello World1!')
    }
}
