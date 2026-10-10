package bw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.MainThread;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.MimeTypes;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.exception.ComponentException;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: bw.f0 */
/* JADX INFO: compiled from: DialogQueueManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004!\"#$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0007J\b\u0010\u0018\u001a\u00020\u0012H\u0003J\b\u0010\u0019\u001a\u00020\u0012H\u0007J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogQueueManager;", "", "<init>", "()V", "TAG", "", "DIALOG_PRIORITY_HIGHEST", "", "DIALOG_PRIORITY_HIGH", "DIALOG_PRIORITY_NORMAL", "DIALOG_PRIORITY_LOW", "DIALOG_PRIORITY_LOWEST", "queue", "Ljava/util/PriorityQueue;", "Lcom/kubi/resources/dialog/DialogQueueManager$PriorityQueueItem;", "tagSet", "Ljava/util/HashSet;", "showQueued", "", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "priority", "dequeue", "clear", "init", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "dequeueDialog", "queueCount", "getQueueCount", "()I", "DialogPriority", "PriorityQueueItem", "TargetPriorityQueueItem", "PriorityQueueItemComparable", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4719f0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4719f0 f4716a = new C4719f0();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PriorityQueue<a> f4717b = new PriorityQueue<>(16, b.f4722b);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashSet<String> f4718c = new HashSet<>();

    /* JADX INFO: renamed from: bw.f0$a */
    /* JADX INFO: compiled from: DialogQueueManager.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\"\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogQueueManager$PriorityQueueItem;", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "priority", "", "tag", "", "<init>", "(Landroidx/fragment/app/DialogFragment;ILjava/lang/String;)V", "getDialog", "()Landroidx/fragment/app/DialogFragment;", "getPriority", "()I", "getTag", "()Ljava/lang/String;", TIMPushProvider.f75062n, "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final DialogFragment f4719a;

        /* JADX INFO: renamed from: b */
        public final int f4720b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f4721c;

        /* JADX INFO: renamed from: d */
        public abstract boolean mo4775d();

        public a(@NotNull DialogFragment dialog, int i11, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f4719a = dialog;
            this.f4720b = i11;
            this.f4721c = tag;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DialogFragment getF4719a() {
            return this.f4719a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF4720b() {
            return this.f4720b;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF4721c() {
            return this.f4721c;
        }
    }

    /* JADX INFO: renamed from: bw.f0$b */
    /* JADX INFO: compiled from: DialogQueueManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogQueueManager$PriorityQueueItemComparable;", "Ljava/util/Comparator;", "Lcom/kubi/resources/dialog/DialogQueueManager$PriorityQueueItem;", "<init>", "()V", "compare", "", "o1", "o2", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Comparator<a> {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final b f4722b = new b();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull a o11, @NotNull a o12) {
            Intrinsics.checkNotNullParameter(o11, "o1");
            Intrinsics.checkNotNullParameter(o12, "o2");
            return Intrinsics.compare(o11.getF4720b(), o12.getF4720b());
        }
    }

    /* JADX INFO: renamed from: bw.f0$c */
    /* JADX INFO: compiled from: DialogQueueManager.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogQueueManager$TargetPriorityQueueItem;", "Lcom/kubi/resources/dialog/DialogQueueManager$PriorityQueueItem;", "dialog", "Landroidx/fragment/app/DialogFragment;", "priority", "", "tag", "", "manager", "Landroidx/fragment/app/FragmentManager;", "<init>", "(Landroidx/fragment/app/DialogFragment;ILjava/lang/String;Landroidx/fragment/app/FragmentManager;)V", "fragmentManager", "Ljava/lang/ref/WeakReference;", TIMPushProvider.f75062n, "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDialogQueueManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogQueueManager.kt\ncom/kubi/resources/dialog/DialogQueueManager$TargetPriorityQueueItem\n+ 2 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,165:1\n44#2,2:166\n*S KotlinDebug\n*F\n+ 1 DialogQueueManager.kt\ncom/kubi/resources/dialog/DialogQueueManager$TargetPriorityQueueItem\n*L\n151#1:166,2\n*E\n"})
    public static final class c extends a {

        /* JADX INFO: renamed from: d */
        @NotNull
        public final WeakReference<FragmentManager> f4723d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull DialogFragment dialog, int i11, @NotNull String tag, @Nullable FragmentManager fragmentManager) {
            super(dialog, i11, tag);
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f4723d = new WeakReference<>(fragmentManager);
        }

        @Override // bw.C4719f0.a
        /* JADX INFO: renamed from: d */
        public boolean mo4775d() {
            FragmentManager fragmentManager = this.f4723d.get();
            if (fragmentManager == null || fragmentManager.isDestroyed() || fragmentManager.isStateSaved() || getF4719a().isAdded()) {
                return false;
            }
            Context context = getF4719a().getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return false;
            }
            try {
                getF4719a().show(fragmentManager, getF4721c());
                return getF4719a().isAdded();
            } catch (Exception e11) {
                C43846g.m96568c(new ComponentException(e11, "TargetPriorityQueueItem.show", false, null, 8, null), null, 2, null);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: bw.f0$d */
    /* JADX INFO: compiled from: DialogQueueManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/dialog/DialogQueueManager$init$1", "Lcom/kubi/resources/GlobalDialogManager$SimpleDialogLifeCycleListener;", "onDestroy", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends GlobalDialogManager.c {
        @Override // com.kubi.resources.GlobalDialogManager.c, com.kubi.resources.GlobalDialogManager.b
        /* JADX INFO: renamed from: e */
        public void mo4777e(DialogFragment dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            C4719f0.f4716a.m4769d();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4766e() {
        f4716a.m4768c();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m4767h(C4719f0 c4719f0, BaseDialogFragment baseDialogFragment, FragmentManager fragmentManager, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 10;
        }
        c4719f0.m4771g(baseDialogFragment, fragmentManager, str, i11);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m4768c() {
        a aVarPoll;
        do {
            aVarPoll = f4717b.poll();
            if (aVarPoll == null) {
                return;
            } else {
                f4718c.remove(aVarPoll.getF4721c());
            }
        } while (!aVarPoll.mo4775d());
    }

    /* JADX INFO: renamed from: d */
    public final void m4769d() {
        if (f4717b.isEmpty()) {
            return;
        }
        C42917g.m94139e().execute(new Runnable() { // from class: bw.e0
            @Override // java.lang.Runnable
            public final void run() {
                C4719f0.m4766e();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m4770f(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        GlobalDialogManager.f43651a.m54345j(new d());
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m4771g(@NotNull BaseDialogFragment baseDialogFragment, @NotNull FragmentManager manager, @NotNull String tag, int i11) {
        Intrinsics.checkNotNullParameter(baseDialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(tag, "tag");
        c cVar = new c(baseDialogFragment, i11, tag, manager);
        PriorityQueue<a> priorityQueue = f4717b;
        if (priorityQueue.isEmpty() && !GlobalDialogManager.f43651a.m54344i()) {
            cVar.mo4775d();
            return;
        }
        if (!f4718c.add(tag)) {
            C44128b.m97261e("DialogQueueManager", "重复的 TAG:" + tag + " in " + baseDialogFragment);
            return;
        }
        C43840a.m96551e(baseDialogFragment + " tag:" + tag + ' ', null, 2, null);
        priorityQueue.add(cVar);
    }
}
