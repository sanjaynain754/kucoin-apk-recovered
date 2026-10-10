package kotlinx.coroutines.selects;

import com.kubi.payment.fast.data.entities.RecurringPlan;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", RecurringPlan.CANCELLED, "ALREADY_SELECTED", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum TrySelectDetailedResult {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f91834c = EnumEntriesKt.enumEntries(m91296a());

    @NotNull
    public static EnumEntries<TrySelectDetailedResult> getEntries() {
        return f91834c;
    }
}
