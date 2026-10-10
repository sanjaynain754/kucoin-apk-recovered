package p827zc;

import androidx.fragment.app.Fragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: renamed from: zc.e */
/* JADX INFO: compiled from: ITradeCoreDataRepoProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\bH\u0086\bø\u0001\u0000\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m90084d2 = {"repoViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "default", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_CREATOR, "Lkotlin/Function1;", "findRepoProvider", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nITradeCoreDataRepoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITradeCoreDataRepoProvider.kt\ncom/kubi/core/base/arch/repo/ITradeCoreDataRepoProviderKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,77:1\n183#2,2:78\n*S KotlinDebug\n*F\n+ 1 ITradeCoreDataRepoProvider.kt\ncom/kubi/core/base/arch/repo/ITradeCoreDataRepoProviderKt\n*L\n75#1:78,2\n*E\n"})
public final class C46755e {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC46753c m103017b(@NotNull Fragment fragment, @NotNull AbstractC46753c abstractC46753c) {
        Object next;
        AbstractC46753c abstractC46753cMo66036p1;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(abstractC46753c, "default");
        Iterator it = SequencesKt.generateSequence(fragment.requireParentFragment(), (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: zc.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46755e.m103019d((Fragment) obj);
            }
        }).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof InterfaceC46752b));
        InterfaceC46752b interfaceC46752b = next instanceof InterfaceC46752b ? (InterfaceC46752b) next : null;
        return (interfaceC46752b == null || (abstractC46753cMo66036p1 = interfaceC46752b.mo66036p1()) == null) ? abstractC46753c : abstractC46753cMo66036p1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC46753c m103018c(Fragment fragment, AbstractC46753c abstractC46753c, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC46753c = new C46751a();
        }
        return m103017b(fragment, abstractC46753c);
    }

    /* JADX INFO: renamed from: d */
    public static final Fragment m103019d(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }
}
