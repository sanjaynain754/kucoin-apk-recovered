package com.jumio.sdk.result;

import android.content.Context;
import android.graphics.Bitmap;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.commons.utils.FileUtil;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.models.AuthorizationModel.SessionKey;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\u000eR\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioImageData;", "Ljava/io/Serializable;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "<init>", "(Lcom/jumio/core/models/AuthorizationModel;)V", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "images", "Ljava/util/HashMap;", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "", "Lkotlin/collections/HashMap;", "addImage", "", "context", "Landroid/content/Context;", "data", "", "credentialPart", "addImage$jumio_core_release", "getByteArray", "getBitmap", "Landroid/graphics/Bitmap;", "hasPart", "", "clear", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioImageData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioImageData.kt\ncom/jumio/sdk/result/JumioImageData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1#2:94\n1863#3,2:95\n*S KotlinDebug\n*F\n+ 1 JumioImageData.kt\ncom/jumio/sdk/result/JumioImageData\n*L\n83#1:95,2\n*E\n"})
public final class JumioImageData implements Serializable {

    /* JADX INFO: renamed from: a */
    public final AuthorizationModel.SessionKey f14734a;

    /* JADX INFO: renamed from: b */
    public final HashMap f14735b;

    public JumioImageData(@NotNull AuthorizationModel authorizationModel) {
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        AuthorizationModel.SessionKey sessionKey = authorizationModel.new SessionKey();
        this.f14734a = sessionKey;
        this.f14735b = new HashMap();
        sessionKey.generate();
    }

    public final void addImage$jumio_core_release(@NotNull Context context, @NotNull byte[] data, @NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        File dataDirectory = Environment.INSTANCE.getDataDirectory(context);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale ENGLISH = Locale.ENGLISH;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strName = credentialPart.name();
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format(ENGLISH, "%d_%s.bin", Arrays.copyOf(new Object[]{lValueOf, lowerCase}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        File file = new File(dataDirectory, str);
        FileUtil.INSTANCE.saveToFile(data, file, this.f14734a);
        this.f14735b.put(credentialPart, file.getAbsolutePath());
    }

    public final void clear() {
        this.f14734a.clear();
        Collection collectionValues = this.f14735b.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.isFile()) {
                file.delete();
            }
        }
        this.f14735b.clear();
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        try {
            String str = (String) this.f14735b.get(credentialPart);
            if (str != null) {
                return BitmapUtilKt.readBitmap$default(str, this.f14734a, null, 4, null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    public final byte[] getByteArray(@NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        try {
            String str = (String) this.f14735b.get(credentialPart);
            if (str != null) {
                return FileUtil.INSTANCE.readFile(str, this.f14734a);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final boolean hasPart(@NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        return this.f14735b.containsKey(credentialPart);
    }
}
