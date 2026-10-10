package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleDeleteItem;", "deleteItems", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "updateItems", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPkgPlatformUpdateTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTaskKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n1611#2:628\n1855#2:629\n1856#2:631\n1612#2:632\n1#3:630\n*S KotlinDebug\n*F\n+ 1 PkgPlatformUpdateTask.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformUpdateTaskKt\n*L\n51#1:628\n51#1:629\n51#1:631\n51#1:632\n51#1:630\n*E\n"})
public final class PkgPlatformUpdateTaskKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m57664a(@Nullable List<CalcBundleDeleteItem> list, @Nullable List<PkgBundleUpdateItem> list2) {
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        final HashSet hashSet = new HashSet();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String biz = ((PkgBundleUpdateItem) it.next()).getBiz();
            if (biz != null) {
                hashSet.add(biz);
            }
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return SequencesKt.toList(SequencesKt.distinct(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(list), new Function1<CalcBundleDeleteItem, String>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTaskKt$selectI18nMetadataDeletionBiz$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull CalcBundleDeleteItem it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getBiz();
            }
        }), new Function1<String, Boolean>() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTaskKt$selectI18nMetadataDeletionBiz$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull String it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf((StringsKt.isBlank(it2) || Intrinsics.areEqual(it2, "krnbase") || hashSet.contains(it2)) ? false : true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        })));
    }
}
