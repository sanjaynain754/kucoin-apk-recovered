package androidx.camera.extensions.internal;

import androidx.annotation.VisibleForTesting;
import org.tensorflow.lite.support.metadata.MetadataParser;

/* JADX INFO: loaded from: classes23.dex */
public class ClientVersion {
    private static ClientVersion sCurrent = new ClientVersion(MetadataParser.VERSION);
    private final Version mVersion;

    public static ClientVersion getCurrentVersion() {
        return sCurrent;
    }

    @VisibleForTesting
    public static void setCurrentVersion(ClientVersion clientVersion) {
        sCurrent = clientVersion;
    }

    public Version getVersion() {
        return this.mVersion;
    }

    public String toVersionString() {
        return this.mVersion.toString();
    }

    public ClientVersion(String str) {
        this.mVersion = Version.parse(str);
    }

    public static boolean isMaximumCompatibleVersion(Version version) {
        if (getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isMinimumCompatibleVersion(Version version) {
        if (getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) >= 0) {
            return true;
        }
        return false;
    }
}
