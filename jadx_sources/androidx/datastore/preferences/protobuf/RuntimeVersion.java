package androidx.datastore.preferences.protobuf;

import androidx.credentials.provider.CredentialEntry;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes34.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    public static final int MINOR = 28;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 28;
    public static final int OSS_PATCH = 2;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        VERSION_STRING = versionString(4, 28, 2, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals(CredentialEntry.TRUE_STRING);
    }

    private RuntimeVersion() {
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i11, int i12, int i13, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i11, i12, i13, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i11, int i12, int i13, String str, String str2) {
        if (!checkDisabled()) {
            String strVersionString = versionString(i11, i12, i13, str);
            if (i11 >= 0 && i12 >= 0 && i13 >= 0) {
                RuntimeDomain runtimeDomain2 = DOMAIN;
                if (runtimeDomain == runtimeDomain2) {
                    if (i11 != 4) {
                        if (i11 == 3) {
                            logger.warning(String.format(" Protobuf gencode version %s is exactly one major version older than the runtime version %s at %s. Please update the gencode to avoid compatibility violations in the next runtime release.", strVersionString, VERSION_STRING, str2));
                        } else {
                            throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime major versions when loading %s: gencode %s, runtime %s. Same major version is required.", str2, strVersionString, VERSION_STRING));
                        }
                    }
                    if (28 >= i12 && (i12 != 28 || 2 >= i13)) {
                        if (28 > i12 || 2 > i13) {
                            logger.warning(String.format(" Protobuf gencode version %s is older than the runtime version %s at %s. Please avoid checked-in Protobuf gencode that can be obsolete.", strVersionString, VERSION_STRING, str2));
                        }
                        if (str.equals("")) {
                            return;
                        } else {
                            throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading %s: gencode %s, runtime %s. Version suffixes must be the same.", str2, strVersionString, VERSION_STRING));
                        }
                    }
                    throw new ProtobufRuntimeVersionException(String.format("Detected incompatible Protobuf Gencode/Runtime versions when loading %s: gencode %s, runtime %s. Runtime version cannot be older than the linked gencode version.", str2, strVersionString, VERSION_STRING));
                }
                throw new ProtobufRuntimeVersionException(String.format("Detected mismatched Protobuf Gencode/Runtime domains when loading %s: gencode %s, runtime %s. Cross-domain usage of Protobuf is not supported.", str2, runtimeDomain, runtimeDomain2));
            }
            throw new ProtobufRuntimeVersionException("Invalid gencode version: " + strVersionString);
        }
    }

    private static String versionString(int i11, int i12, int i13, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), str);
    }
}
