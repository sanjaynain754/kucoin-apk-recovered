package com.facebook.react.views.image;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.InterfaceC5742b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p547q3.C43597c;
import p547q3.InterfaceC43595a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MultiPostprocessor.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor;", "Lcom/facebook/imagepipeline/request/b;", "", "postprocessors", "<init>", "(Ljava/util/List;)V", "", "getName", "()Ljava/lang/String;", "Lq3/a;", "getPostprocessorCacheKey", "()Lq3/a;", "Landroid/graphics/Bitmap;", "sourceBitmap", "Lp5/c;", "bitmapFactory", "La4/a;", "process", "(Landroid/graphics/Bitmap;Lp5/c;)La4/a;", "Ljava/util/List;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiPostprocessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1557#2:63\n1628#2,3:64\n*S KotlinDebug\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n*L\n26#1:63\n26#1:64,3\n*E\n"})
public final class MultiPostprocessor implements InterfaceC5742b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<InterfaceC5742b> postprocessors;

    /* JADX INFO: compiled from: MultiPostprocessor.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor$Companion;", "", "<init>", "()V", "", "Lcom/facebook/imagepipeline/request/b;", "postprocessors", "from", "(Ljava/util/List;)Lcom/facebook/imagepipeline/request/b;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final InterfaceC5742b from(@NotNull List<? extends InterfaceC5742b> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size == 0) {
                return null;
            }
            if (size != 1) {
                return new MultiPostprocessor(postprocessors, defaultConstructorMarker);
            }
            return postprocessors.get(0);
        }
    }

    public /* synthetic */ MultiPostprocessor(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private MultiPostprocessor(List<? extends InterfaceC5742b> list) {
        this.postprocessors = new LinkedList(list);
    }

    @JvmStatic
    @Nullable
    public static final InterfaceC5742b from(@NotNull List<? extends InterfaceC5742b> list) {
        return INSTANCE.from(list);
    }

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    @NotNull
    public String getName() {
        return "MultiPostProcessor (" + CollectionsKt.joinToString$default(this.postprocessors, ",", null, null, 0, null, null, 62, null) + ")";
    }

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    @NotNull
    public InterfaceC43595a getPostprocessorCacheKey() {
        List<InterfaceC5742b> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5742b) it.next()).getPostprocessorCacheKey());
        }
        return new C43597c(arrayList);
    }

    @Override // com.facebook.imagepipeline.request.InterfaceC5742b
    @NotNull
    public AbstractC0110a<Bitmap> process(@NotNull Bitmap sourceBitmap, @NotNull AbstractC43387c bitmapFactory) {
        Bitmap bitmapM565l;
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        AbstractC0110a<Bitmap> abstractC0110aProcess = null;
        try {
            AbstractC0110a<Bitmap> abstractC0110aClone = null;
            for (InterfaceC5742b interfaceC5742b : this.postprocessors) {
                if (abstractC0110aClone == null || (bitmapM565l = abstractC0110aClone.m565l()) == null) {
                    bitmapM565l = sourceBitmap;
                }
                abstractC0110aProcess = interfaceC5742b.process(bitmapM565l, bitmapFactory);
                AbstractC0110a.m555j(abstractC0110aClone);
                abstractC0110aClone = abstractC0110aProcess.clone();
            }
            if (abstractC0110aProcess != null) {
                AbstractC0110a<Bitmap> abstractC0110aClone2 = abstractC0110aProcess.clone();
                Intrinsics.checkNotNullExpressionValue(abstractC0110aClone2, "clone(...)");
                AbstractC0110a.m555j(abstractC0110aProcess);
                return abstractC0110aClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
        } catch (Throwable th2) {
            AbstractC0110a.m555j(null);
            throw th2;
        }
    }
}
