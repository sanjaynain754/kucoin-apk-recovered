package p792yb;

import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tuicore.TUIConstants;
import ir.C40167b;
import ir.InterfaceC40166a;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: yb.b */
/* JADX INFO: compiled from: AutoCleanNoticeUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000e\u001a\u00020\u0005*\u00020\u0005H\u0002J\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0000¢\u0006\u0002\b\u0017J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0019J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/clean/util/AutoCleanNoticeUtil;", "", "<init>", "()V", "TIME_FORMAT_STR", "", "AGREEMENT_URL", "getAGREEMENT_URL", "()Ljava/lang/String;", "AGREEMENT_URL$delegate", "Lcom/kubi/network/api/utils/Link;", "FILENAME_AUTO_CLEAN_NOTICE", "TIME_24H", "", "formatShowTimeKey", "refreshDialogShowTime", "", "bizType", "refreshDialogShowTime$AutoCleanUserLib_googleRelease", "resetDialogShowTime", "list", "", "Lcom/kubi/clean/api/entity/AutoCleanBizType;", "resetDialogShowTime$AutoCleanUserLib_googleRelease", "getLastShowTime", "getLastShowTime$AutoCleanUserLib_googleRelease", "getUtcTime", "time", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoCleanNoticeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCleanNoticeUtil.kt\ncom/kubi/clean/util/AutoCleanNoticeUtil\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,76:1\n75#2,2:77\n15#2:79\n84#2:80\n*S KotlinDebug\n*F\n+ 1 AutoCleanNoticeUtil.kt\ncom/kubi/clean/util/AutoCleanNoticeUtil\n*L\n40#1:77,2\n50#1:79\n67#1:80\n*E\n"})
public final class C46426b {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f104098b = {Reflection.property1(new PropertyReference1Impl(C46426b.class, "AGREEMENT_URL", "getAGREEMENT_URL()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46426b f104097a = new C46426b();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC40166a f104099c = C40167b.m88525a(new Function0() { // from class: yb.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C46426b.m102394b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final String m102394b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.e());
        sb2.append("/news/");
        sb2.append(MultiLanguageManager.m56979h() ? "futures-terms-of-use-list" : "en-futures-terms-of-use-list");
        sb2.append("?loading=2");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m102395c(String str) {
        return str + "-LastShowAt";
    }

    /* JADX INFO: renamed from: d */
    public final void m102396d(@NotNull List<? extends AutoCleanBizType> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<? extends AutoCleanBizType> it = list.iterator();
        while (it.hasNext()) {
            C46392a.m102335r(new StorageId("fileNameAutoCleanNoticeCache", m102395c(it.next().name()), StorageType.LocalSite, false, 8, null));
        }
    }
}
