import org.gradle.api.tasks.wrapper.Wrapper.DistributionType

plugins {
    id("eclipse")
    id("idea")
    id("org.asciidoctor.jvm.epub") version "3.0.0-alpha.3"
    id("com.github.ben-manes.versions") version "0.27.0"
}

repositories {
    jcenter()
}

tasks.wrapper {
    gradleVersion = "6.0.1"
    distributionType = DistributionType.ALL
}

tasks.asciidoctorEpub {
    baseDirFollowsSourceDir()
    ebookFormats("epub3")
}
