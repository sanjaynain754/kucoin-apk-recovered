package com.kubi.advert;

import android.util.Base64;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.h */
/* JADX INFO: compiled from: AdvertEx.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"AF_INFO", "", "base64Dec", "value", "logInfo", "", "tag", "AdvertLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9356h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m14780a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        byte[] bArrDecode = Base64.decode(value, 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return new String(bArrDecode, charsetForName);
    }
}
