plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
}

group = "org.regex.dsl"
version = "v1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.jobdk"
            artifactId = "regexkotlindsl"
            version = "v1.0.0"

            from(components["java"])
        }
    }
}
