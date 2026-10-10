package com.google.api.client.googleapis.mtls;

import androidx.credentials.provider.CredentialEntry;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.SecurityUtils;
import com.google.common.annotations.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MtlsUtils {
    private static final MtlsProvider MTLS_PROVIDER = new DefaultMtlsProvider();

    @VisibleForTesting
    public static class DefaultMtlsProvider implements MtlsProvider {
        private static final String DEFAULT_CONTEXT_AWARE_METADATA_PATH = System.getProperty("user.home") + "/.secureConnect/context_aware_metadata.json";
        public static final String GOOGLE_API_USE_CLIENT_CERTIFICATE = "GOOGLE_API_USE_CLIENT_CERTIFICATE";
        private EnvironmentProvider envProvider;
        private String metadataPath;

        public interface EnvironmentProvider {
            String getenv(String str);
        }

        public DefaultMtlsProvider() {
            this(new SystemEnvironmentProvider(), DEFAULT_CONTEXT_AWARE_METADATA_PATH);
        }

        public static class SystemEnvironmentProvider implements EnvironmentProvider {
            @Override // com.google.api.client.googleapis.mtls.MtlsUtils.DefaultMtlsProvider.EnvironmentProvider
            public String getenv(String str) {
                return System.getenv(str);
            }
        }

        @VisibleForTesting
        public DefaultMtlsProvider(EnvironmentProvider environmentProvider, String str) {
            this.envProvider = environmentProvider;
            this.metadataPath = str;
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public KeyStore getKeyStore() throws GeneralSecurityException, IOException {
            try {
                Process processStart = new ProcessBuilder(extractCertificateProviderCommand(new FileInputStream(this.metadataPath))).start();
                int iRunCertificateProviderCommand = runCertificateProviderCommand(processStart, 1000L);
                if (iRunCertificateProviderCommand == 0) {
                    return SecurityUtils.createMtlsKeyStore(processStart.getInputStream());
                }
                throw new IOException("Cert provider command failed with exit code: " + iRunCertificateProviderCommand);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (InterruptedException e11) {
                throw new IOException("Interrupted executing certificate provider command", e11);
            }
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public String getKeyStorePassword() {
            return "";
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public boolean useMtlsClientCertificate() {
            return CredentialEntry.TRUE_STRING.equals(this.envProvider.getenv(GOOGLE_API_USE_CLIENT_CERTIFICATE));
        }

        @VisibleForTesting
        public static List<String> extractCertificateProviderCommand(InputStream inputStream) throws IOException {
            return ((ContextAwareMetadataJson) Utils.getDefaultJsonFactory().createJsonParser(inputStream).parse(ContextAwareMetadataJson.class)).getCommands();
        }

        @VisibleForTesting
        public static int runCertificateProviderCommand(Process process, long j11) throws InterruptedException, IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            do {
                try {
                    process.exitValue();
                    return process.exitValue();
                } catch (IllegalThreadStateException unused) {
                    if (j11 > 0) {
                        Thread.sleep(Math.min(1 + j11, 100L));
                    }
                    j11 -= System.currentTimeMillis() - jCurrentTimeMillis;
                }
            } while (j11 > 0);
            process.destroy();
            throw new IOException("cert provider command timed out");
        }
    }

    public static MtlsProvider getDefaultMtlsProvider() {
        return MTLS_PROVIDER;
    }
}
