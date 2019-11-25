import com.soywiz.korge.gradle.*

buildscript {
    repositories {
        jcenter()
        mavenLocal()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:1.4.0")
    }
}

apply(plugin = "korge")

korge {
    id = "me.emig.engineEmi"
    name = "EngineEmi"
    description = ""
    orientation = Orientation.LANDSCAPE
    jvmMainClassName = "MainKt"

    supportShapeOps()
    supportTriangulation()
    supportDragonbones()
    supportBox2d()
}



tasks.register<Copy>("copyHtmlToBuildfolder"){
    group = "engineemi"
    from("src/html/")
    into("${buildDir}/web/")

    mustRunAfter("jsWeb")
}


tasks.register<DefaultTask>("openInBrowser"){
    group = "engineemi"
    //   dependsOn("compileKotlinJs")
    //  dependsOn("genResources")
    // dependsOn("jsProcessResources")
    // dependsOn("jsMainClasses")
    // dependsOn("jsJar")
    // dependsOn("jsWeb")
    // dependsOn("copyHtmlToBuildfolder")


    dependsOn("jsWebRun")
}

tasks.register<DefaultTask>("openLocal"){
    group = "engineemi"
    //   dependsOn("compileKotlinJs")
    //  dependsOn("genResources")
    // dependsOn("jsProcessResources")
    // dependsOn("jsMainClasses")
    // dependsOn("jsJar")
    // dependsOn("jsWeb")
    // dependsOn("copyHtmlToBuildfolder")


    dependsOn("runJvm")
}







//kotlin.sourceSets["commonMain"].resources.srcDir("src")
kotlin.sourceSets["commonMain"].kotlin.srcDir("src")
kotlin.sourceSets["commonMain"].resources.srcDir("resources")


