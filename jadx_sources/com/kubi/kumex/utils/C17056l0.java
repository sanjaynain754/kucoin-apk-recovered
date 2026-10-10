package com.kubi.kumex.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.style.TypefaceSpan;
import androidx.annotation.FontRes;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.futures.trade.welfare.C14439y;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.tencent.bugly.proguard.C33616e0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kumex.utils.l0 */
/* JADX INFO: compiled from: StyleTextEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\t\u001a\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005¨\u0006\f"}, m90084d2 = {"appendFont", "Lcom/kubi/utils/StyledText;", "text", "", "fontRes", "", C33616e0.f69645t, "", "", "(Lcom/kubi/utils/StyledText;Ljava/lang/String;I[Ljava/lang/Object;)Lcom/kubi/utils/StyledText;", "createFontSpan", "Landroid/text/style/TypefaceSpan;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStyleTextEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyleTextEx.kt\ncom/kubi/kumex/utils/StyleTextExKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,37:1\n37#2:38\n36#2,3:39\n*S KotlinDebug\n*F\n+ 1 StyleTextEx.kt\ncom/kubi/kumex/utils/StyleTextExKt\n*L\n26#1:38\n26#1:39,3\n*E\n"})
public final class C17056l0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C27096v0 m36544a(@NotNull C27096v0 c27096v0, @NotNull String text, @FontRes int i11, @NotNull Object... spans) {
        Typeface font;
        Intrinsics.checkNotNullParameter(c27096v0, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spans, "spans");
        List mutableList = CollectionsKt.toMutableList((Collection) ArraysKt.asList(spans));
        if (Build.VERSION.SDK_INT >= 28 && (font = ResourcesCompat.getFont(C27017c.f54310a.m66513b(), i11)) != null) {
            mutableList.add(C14439y.m28811a(font));
        }
        Object[] array = mutableList.toArray(new Object[0]);
        c27096v0.m66903c(text, Arrays.copyOf(array, array.length));
        return c27096v0;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final TypefaceSpan m36545b(@FontRes int i11) {
        Typeface font;
        if (Build.VERSION.SDK_INT < 28 || (font = ResourcesCompat.getFont(C27017c.f54310a.m66513b(), i11)) == null) {
            return null;
        }
        return C14439y.m28811a(font);
    }
}
