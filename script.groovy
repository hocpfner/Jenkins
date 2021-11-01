def buildApp() {
    echo 'building the application...'
}

def testdApp() {
    echo 'testing the application...'
}

def deploydApp() {
    echo 'deploying the application...'
    echo "deploying VERSION ${params.VERSION}"
}

return this