package com.kubi.sdk.pkg.task;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.blankj.utilcode.util.C5288p;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.sdk.pkg.util.C23984a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.text.StringsKt;
import rg0.C44091j;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: TaskCommon.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0001\"\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c*\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!\u001a\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m90084d2 = {"", "", "names", "f", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "path", "", "b", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "e", "(Landroid/content/Context;)Ljava/lang/String;", "Lokhttp3/Call;", "Lokhttp3/Response;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, JPushConstants.Analysis.KEY_JSON, "Ljava/lang/Class;", "classOfT", "c", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Landroid/content/res/AssetManager;", "", "deep", "", "g", "(Landroid/content/res/AssetManager;Ljava/lang/String;I)Ljava/util/List;", "Ljava/io/File;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/io/File;I)Ljava/util/List;", "permits", "Lrg0/g;", "i", "(I)Lrg0/g;", "Package_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTaskCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,184:1\n62#1:202\n314#2,11:185\n1360#3:196\n1446#3,2:197\n1448#3,3:204\n1360#3:207\n1446#3,2:208\n1549#3:210\n1620#3,3:211\n766#3:214\n857#3,2:215\n1448#3,3:217\n11335#4:199\n11670#4,2:200\n11672#4:203\n81#5,9:220\n*S KotlinDebug\n*F\n+ 1 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n133#1:202\n96#1:185,11\n128#1:196\n128#1:197,2\n128#1:204,3\n147#1:207\n147#1:208,2\n152#1:210\n152#1:211,3\n152#1:214\n152#1:215,2\n147#1:217,3\n133#1:199\n133#1:200,2\n133#1:203\n176#1:220,9\n*E\n"})
public final class TaskCommonKt {

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.task.TaskCommonKt$a */
    /* JADX INFO: compiled from: TaskCommon.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/kubi/sdk/pkg/task/TaskCommonKt$a", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C23971a implements Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Response> f47429b;

        /* JADX WARN: Multi-variable type inference failed */
        public C23971a(InterfaceC41708m<? super Response> interfaceC41708m) {
            this.f47429b = interfaceC41708m;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NotNull Call call, @NotNull IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            InterfaceC41708m<Response> interfaceC41708m = this.f47429b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
        }

        @Override // okhttp3.Callback
        public void onResponse(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f47429b.resumeWith(Result.m103844constructorimpl(response));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final InterfaceC44088g m57799i(int i11) {
        if (i11 <= 0) {
            return null;
        }
        return C44091j.m97148b(i11, 0, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m57791a(@NotNull final Call call, @NotNull Continuation<? super Response> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: com.kubi.sdk.pkg.task.TaskCommonKt$awaitResponse$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                call.cancel();
            }
        });
        FirebasePerfOkHttpClient.enqueue(call, new C23971a(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m57792b(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new File(path).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> T m57793c(@Nullable String str, @NotNull Class<T> classOfT) {
        Intrinsics.checkNotNullParameter(classOfT, "classOfT");
        try {
            return (T) C5288p.m6342d(str, classOfT);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "json 解析异常";
            }
            C43840a.m96549c(message, null, 2, null);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m57794d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, separator, 0, false, 6, (Object) null);
        return iLastIndexOf$default > 0 ? StringsKt.substring(str, new IntRange(0, iLastIndexOf$default)) : str;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m57795e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String path = C23984a.f47488a.m57864c(context).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "FileUtil.getFileDirectory(context).path");
        return path;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m57796f(@NotNull String str, @NotNull String... names) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(names, "names");
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : names) {
            sb2.append(File.separator);
            sb2.append(str2);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final List<String> m57797g(@NotNull AssetManager assetManager, @NotNull String path, int i11) throws IOException {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        List<String> listListOf = CollectionsKt.listOf(path);
        if (i11 < 0) {
            return listListOf;
        }
        int i12 = 0;
        while (true) {
            List<String> list = CollectionsKt.toList(listListOf);
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                String[] list2 = assetManager.list(str);
                if (list2 == null || list2.length == 0) {
                    collectionEmptyList = CollectionsKt.emptyList();
                } else {
                    collectionEmptyList = new ArrayList(list2.length);
                    for (String it : list2) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        collectionEmptyList.add(str + File.separator + it);
                    }
                }
                CollectionsKt.addAll(arrayList, collectionEmptyList);
            }
            if (i12 == i11) {
                return arrayList;
            }
            i12++;
            listListOf = arrayList;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final List<File> m57798h(@NotNull File file, int i11) {
        List list;
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.isDirectory()) {
            return CollectionsKt.emptyList();
        }
        List<File> listListOf = CollectionsKt.listOf(file);
        if (i11 < 0) {
            return listListOf;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listListOf) {
                String[] list2 = file2.list();
                if (list2 != null) {
                    Intrinsics.checkNotNullExpressionValue(list2, "list()");
                    list = ArraysKt.toList(list2);
                } else {
                    list = null;
                }
                if (list == null || list.isEmpty()) {
                    collectionEmptyList = CollectionsKt.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new File(file2, (String) it.next()));
                    }
                    collectionEmptyList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((File) obj).isDirectory()) {
                            collectionEmptyList.add(obj);
                        }
                    }
                }
                CollectionsKt.addAll(arrayList, collectionEmptyList);
            }
            if (i12 == i11) {
                return arrayList;
            }
            i12++;
            listListOf = arrayList;
        }
    }
}
