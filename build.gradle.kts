plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.ezbery"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.structurizr:structurizr-client:3.0+")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}