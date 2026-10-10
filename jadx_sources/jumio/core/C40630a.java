package jumio.core;

import androidx.credentials.provider.CredentialEntry;
import com.jumio.ale.swig.ALECore;
import com.jumio.ale.swig.ALEHeader;
import com.jumio.ale.swig.ALEInputStream;
import com.jumio.ale.swig.ALEOutputStream;
import com.jumio.ale.swig.ALERequest;
import com.jumio.commons.log.Log;
import com.jumio.core.network.EncryptionProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40630a implements EncryptionProvider {

    /* JADX INFO: renamed from: a */
    public final ALECore f90201a;

    /* JADX INFO: renamed from: b */
    public final String f90202b;

    /* JADX INFO: renamed from: c */
    public ALERequest f90203c;

    public C40630a(@NotNull ALECore mAleCore, @NotNull String mCredentials) {
        Intrinsics.checkNotNullParameter(mAleCore, "mAleCore");
        Intrinsics.checkNotNullParameter(mCredentials, "mCredentials");
        this.f90201a = mAleCore;
        this.f90202b = mCredentials;
    }

    /* JADX INFO: renamed from: a */
    public static String m89249a(ALEInputStream aLEInputStream) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(aLEInputStream, StandardCharsets.UTF_8));
            while (true) {
                int i11 = bufferedReader.read(cArr);
                if (i11 == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(aLEInputStream, null);
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i11);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(aLEInputStream, th2);
                throw th3;
            }
        }
    }

    @Override // com.jumio.core.network.EncryptionProvider
    @NotNull
    public OutputStream createRequest(@NotNull OutputStream outputStream, int i11, @NotNull String contentType) throws Exception {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        try {
            ALERequest aLERequestCreateRequest = this.f90201a.createRequest();
            Intrinsics.checkNotNull(aLERequestCreateRequest);
            this.f90203c = aLERequestCreateRequest;
            Log.m14463d("Network/ALE", "encrypting plaintext");
            ALEHeader aLEHeader = new ALEHeader();
            aLEHeader.add("Content-Type", contentType);
            aLEHeader.add("Authorization", this.f90202b);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ALERequest aLERequest = this.f90203c;
            if (aLERequest == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
                aLERequest = null;
            }
            return new ALEOutputStream(bufferedOutputStream, aLERequest, aLEHeader, i11);
        } catch (Exception e11) {
            throw new Exception(e11.getMessage());
        }
    }

    @Override // com.jumio.core.network.EncryptionProvider
    public void finishRequest() {
        ALECore aLECore = this.f90201a;
        ALERequest aLERequest = this.f90203c;
        if (aLERequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            aLERequest = null;
        }
        aLECore.destroyRequest(aLERequest);
    }

    @Override // com.jumio.core.network.EncryptionProvider
    @NotNull
    public String getResponse(@Nullable InputStream inputStream) throws C40599T3, C40636b {
        String strM89249a;
        Log.m14463d("Network/ALE", "decrypting response stream");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ALERequest aLERequest = this.f90203c;
        ALERequest aLERequest2 = null;
        if (aLERequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            aLERequest = null;
        }
        ALEInputStream aLEInputStream = new ALEInputStream(bufferedInputStream, aLERequest);
        ALERequest aLERequest3 = this.f90203c;
        if (aLERequest3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            aLERequest3 = null;
        }
        Log.m14479v("Network/ALE", "Response: ".concat(aLERequest3.isVerified() ? "valid" : "invalid"));
        StringBuilder sb2 = new StringBuilder("Error code: ");
        ALERequest aLERequest4 = this.f90203c;
        if (aLERequest4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            aLERequest4 = null;
        }
        sb2.append(aLERequest4.getErrorCode());
        Log.m14479v("Network/ALE", sb2.toString());
        ALERequest aLERequest5 = this.f90203c;
        if (aLERequest5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            aLERequest5 = null;
        }
        Log.m14479v("Network/ALE", "Key update: ".concat(aLERequest5.isKeyUpdate() ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING));
        try {
            strM89249a = m89249a(aLEInputStream);
        } catch (IOException unused) {
            strM89249a = "";
        }
        try {
            ALERequest aLERequest6 = this.f90203c;
            if (aLERequest6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
                aLERequest6 = null;
            }
            if (aLERequest6.isVerified()) {
                ALERequest aLERequest7 = this.f90203c;
                if (aLERequest7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
                } else {
                    aLERequest2 = aLERequest7;
                }
                if (aLERequest2.isKeyUpdate()) {
                    throw new C40636b();
                }
                finishRequest();
                return strM89249a;
            }
            ALERequest aLERequest8 = this.f90203c;
            if (aLERequest8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
                aLERequest8 = null;
            }
            if (aLERequest8.getErrorCode() == 0) {
                throw new C40599T3(0, "Response not verified");
            }
            ALERequest aLERequest9 = this.f90203c;
            if (aLERequest9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
                aLERequest9 = null;
            }
            int errorCode = aLERequest9.getErrorCode();
            StringBuilder sb3 = new StringBuilder("Response returned ");
            ALERequest aLERequest10 = this.f90203c;
            if (aLERequest10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aleRequest");
            } else {
                aLERequest2 = aLERequest10;
            }
            sb3.append(aLERequest2.getErrorCode());
            throw new C40599T3(errorCode, sb3.toString());
        } catch (Throwable th2) {
            finishRequest();
            throw th2;
        }
    }
}
