package androidx.camera.extensions.internal;

import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ExtensionVersion {
    private static final String TAG = "ExtenderVersion";
    private static volatile ExtensionVersion sExtensionVersion;

    public static class DefaultExtenderVersioning extends ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public Version getVersionObject() {
            return null;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            return false;
        }
    }

    public static class VendorExtenderVersioning extends ExtensionVersion {
        private static ExtensionVersionImpl sImpl;
        private Version mRuntimeVersion;

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public Version getVersionObject() {
            return this.mRuntimeVersion;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            try {
                return sImpl.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }

        public VendorExtenderVersioning() {
            if (sImpl == null) {
                sImpl = new ExtensionVersionImpl();
            }
            Version version = Version.parse(sImpl.checkApiVersion(ClientVersion.getCurrentVersion().toVersionString()));
            if (version != null && ClientVersion.getCurrentVersion().getVersion().getMajor() == version.getMajor()) {
                this.mRuntimeVersion = version;
            }
            Logger.m1866d(ExtensionVersion.TAG, "Selected vendor runtime: " + this.mRuntimeVersion);
        }
    }

    public abstract Version getVersionObject();

    public abstract boolean isAdvancedExtenderSupportedInternal();

    private static ExtensionVersion getInstance() {
        if (sExtensionVersion != null) {
            return sExtensionVersion;
        }
        synchronized (ExtensionVersion.class) {
            if (sExtensionVersion == null) {
                try {
                    sExtensionVersion = new VendorExtenderVersioning();
                } catch (NoClassDefFoundError unused) {
                    Logger.m1866d(TAG, "No versioning extender found. Falling back to default.");
                    sExtensionVersion = new DefaultExtenderVersioning();
                }
            }
        }
        return sExtensionVersion;
    }

    @VisibleForTesting
    public static void injectInstance(ExtensionVersion extensionVersion) {
        sExtensionVersion = extensionVersion;
    }

    public static Version getRuntimeVersion() {
        return getInstance().getVersionObject();
    }

    public static boolean isAdvancedExtenderSupported() {
        return getInstance().isAdvancedExtenderSupportedInternal();
    }

    public static boolean isExtensionVersionSupported() {
        if (getInstance().getVersionObject() != null) {
            return true;
        }
        return false;
    }

    public static boolean isMaximumCompatibleVersion(Version version) {
        if (getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isMinimumCompatibleVersion(Version version) {
        if (getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) >= 0) {
            return true;
        }
        return false;
    }
}
