package p741wy;

import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: wy.m */
/* JADX INFO: compiled from: IFlutterTransmit.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052,\b\u0002\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/flutter/transmit/IRNNotifyTransmit;", "Lcom/kubi/sdk/flutter/transmit/ITransmit;", "sendEventToRN", "", "eventName", "", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45953m extends InterfaceC45957q {
    void sendEventToRN(@NotNull String eventName, @Nullable HashMap<String, Object> params);
}
