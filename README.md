Apache MAVEN is used in: 1.Build-tool 2.Dependency management 3.Unit-testing 4.Documentation 5.Reporting

Single touch point:POM
groupId - companies name in reverse
Main sections of POM: 1.Project information groupId artifactId Version 2.Properties 3.Dependencies 4.Build 5.Report 6.Repositories 7.Profiles

---------------------------------------------

Build:
<build> </build>> section defines
project's build behavior:

1.Which plugins to run
2.Where the source/output files are
3.Custom build behavior based on profiles

main tags:
<directory>,
<outputDirectory>,
<testOutputDirectory>,
<sourceDirectory>,
<testSourceDirectory>,
<resources>,
<testResources>,
<plugins> -> <plugin> (mainly maven plugins);

--------------------------------------------------
Reporting:
only works within the 'site' command
no default <reporting> section in POM like <build>

gives us index.html ui.

use-cases of reporting:
1.Code-coverage
2.Test-reports
3.Static analysis
4.API documentation

mvn -U clean site - force recheck the remote repos.












