package com.kubi.utils.extensions;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.utils.extensions.b */
/* JADX INFO: compiled from: CollectionsEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0003\u001a+\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "c", "(Ljava/util/List;)Ljava/util/List;", "", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/util/SparseArray;", "Lio/reactivex/functions/Consumer;", TUIConstants.TUIChat.CALL_BACK, "", "d", "(Landroid/util/SparseArray;Lio/reactivex/functions/Consumer;)V", "Lkotlin/Function1;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCollectionsEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n99#1:129\n1864#2,3:124\n1855#2,2:127\n2634#2:130\n1#3:131\n*S KotlinDebug\n*F\n+ 1 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n111#1:129\n34#1:124,3\n78#1:127,2\n122#1:130\n122#1:131\n*E\n"})
public final class C27024b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> List<T> m66558a(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> List<T> m66559b(@Nullable List<T> list) {
        return list == null ? new ArrayList() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> List<T> m66560c(@Nullable List<? extends T> list) {
        return list == 0 ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> void m66561d(@NotNull SparseArray<T> sparseArray, @NotNull Consumer<T> callback) throws Exception {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (sparseArray.valueAt(i11) != null) {
                callback.accept(sparseArray.valueAt(i11));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final <T> void m66562e(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = CollectionsKt.toList(list).iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }
}
