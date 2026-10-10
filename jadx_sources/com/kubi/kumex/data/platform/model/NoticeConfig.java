package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NoticeConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002`\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0086\bJ$\u0010\r\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/NoticeConfig;", "Ljava/util/ArrayList;", "", "", "", "Lkotlin/collections/ArrayList;", "Landroid/os/Parcelable;", "<init>", "()V", TtmlNode.TAG_BODY, "", ExifInterface.GPS_DIRECTION_TRUE, "type", "first", "(Ljava/lang/String;)Ljava/lang/Object;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,51:1\n21#1:60\n22#1:63\n23#1:65\n24#1:69\n774#2:52\n865#2,2:53\n1563#2:55\n1634#2,2:56\n1636#2:59\n774#2:61\n865#2:62\n866#2:64\n1563#2:66\n1634#2,2:67\n1636#2:71\n149#3:58\n149#3:70\n*S KotlinDebug\n*F\n+ 1 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n*L\n29#1:60\n29#1:63\n29#1:65\n29#1:69\n21#1:52\n21#1:53,2\n23#1:55\n23#1:56,2\n23#1:59\n29#1:61\n29#1:62\n29#1:64\n29#1:66\n29#1:67,2\n29#1:71\n24#1:58\n29#1:70\n*E\n"})
public final class NoticeConfig extends ArrayList<Map<String, ? extends Object>> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NoticeConfig> CREATOR = new C15815a();

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.NoticeConfig$a */
    /* JADX INFO: compiled from: NoticeConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15815a implements Parcelable.Creator<NoticeConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NoticeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new NoticeConfig();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NoticeConfig[] newArray(int i11) {
            return new NoticeConfig[i11];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.NoticeConfig$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15816b<T> extends TypeToken<T> {
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.NoticeConfig$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/kumex/data/platform/model/NoticeConfig$body$lambda$1$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 176)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15817c<T> extends TypeToken<T> {
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map) {
            return contains((Map<String, ? extends Object>) obj);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Map) {
            return indexOf((Map<String, ? extends Object>) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Map) {
            return lastIndexOf((Map<String, ? extends Object>) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Map<String, Object> remove(int i11) {
        return removeAt(i11);
    }

    public final /* synthetic */ <T> List<T> body(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        for (Map<String, ? extends Object> map : this) {
            if (Intrinsics.areEqual(map.get("type"), type)) {
                arrayList.add(map);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String strM66606i = C27029c.m66606i((Map) it.next());
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C27099x c27099x = C27099x.f54458a;
            Intrinsics.needClassReification();
            arrayList2.add(C27099x.m66914d(strM66606i, new C15816b().getType()));
        }
        return arrayList2;
    }

    public /* bridge */ boolean contains(Map<String, ? extends Object> map) {
        return super.contains((Object) map);
    }

    public final /* synthetic */ <T> T first(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        for (Map<String, ? extends Object> map : this) {
            if (Intrinsics.areEqual(map.get("type"), type)) {
                arrayList.add(map);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            String strM66606i = C27029c.m66606i((Map) it.next());
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C27099x c27099x = C27099x.f54458a;
            Intrinsics.needClassReification();
            arrayList2.add(C27099x.m66914d(strM66606i, new C15817c().getType()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (T) arrayList2.get(0);
    }

    public /* bridge */ int indexOf(Map<String, ? extends Object> map) {
        return super.indexOf((Object) map);
    }

    public /* bridge */ int lastIndexOf(Map<String, ? extends Object> map) {
        return super.lastIndexOf((Object) map);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map) {
            return remove((Map<String, ? extends Object>) obj);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ boolean remove(Map<String, ? extends Object> map) {
        return super.remove((Object) map);
    }

    public /* bridge */ Map<String, Object> removeAt(int i11) {
        return (Map) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
