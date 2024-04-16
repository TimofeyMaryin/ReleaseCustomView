package custom.test.releasecustomview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import custom.lib.droid.decrypt_helper.EncryptionHelper
import custom.test.releasecustomview.ui.theme.ReleaseCustomViewTheme
import custom.web.view.compose.UserDataShowContent
import custom.web.view.compose.UserWebView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReleaseCustomViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // val secreteKey = EncryptionHelper.generateRandomString(32)
                    val encryptUrl = EncryptionHelper.encrypt("https://youtube.com", EncryptionHelper.secretKey)
                    UserDataShowContent(value = encryptUrl)
                }
            }
        }
    }
}

