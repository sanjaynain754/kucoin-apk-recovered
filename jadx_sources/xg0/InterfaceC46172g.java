package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: xg0.g */
/* JADX INFO: compiled from: JsonDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lxg0/g;", "Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "Lkotlinx/serialization/json/JsonElement;", "b", "()Lkotlinx/serialization/json/JsonElement;", "Lxg0/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC46172g extends InterfaceC41787b, CompositeDecoder {
    @NotNull
    /* JADX INFO: renamed from: a */
    AbstractC46162a getJson();

    @NotNull
    /* JADX INFO: renamed from: b */
    JsonElement mo91896b();
}
