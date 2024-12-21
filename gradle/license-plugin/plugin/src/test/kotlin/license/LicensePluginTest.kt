package license

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

class LicensePluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("online.ravlinko.license")

        // Verify the result
        assertNotNull(project.tasks.findByName("greeting"))
    }
}
