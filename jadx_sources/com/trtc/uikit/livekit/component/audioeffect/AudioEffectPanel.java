package com.trtc.uikit.livekit.component.audioeffect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectState;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceState;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import vc0.C45496e;
import zc0.C46757b;
import zc0.C46759d;

/* JADX INFO: compiled from: AudioEffectPanel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textEarReturnVolume", "Landroid/widget/TextView;", "textPeopleVolume", "audioEffectStore", "Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;", "deviceStore", "Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;", "onBackButtonClickListener", "Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$OnBackButtonClickListener;", "init", "", "roomId", "", "setOnBackButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initStore", "addObserver", "removeObserver", "initView", "bindViewId", "initEarReturnVolume", "initEnableEarReturnView", "initPeopleVolumeView", "initEarReturnVolumeView", "initFinishView", "initReverbView", "initChangeVoiceView", "reportData", "OnBackButtonClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AudioEffectPanel extends BasicView {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Context f77599d;

    /* JADX INFO: renamed from: e */
    public TextView f77600e;

    /* JADX INFO: renamed from: f */
    public TextView f77601f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AudioEffectStore f77602g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public DeviceStore f77603h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC35877a f77604i;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel$a */
    /* JADX INFO: compiled from: AudioEffectPanel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$OnBackButtonClickListener;", "", "onClick", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35877a {
        /* JADX INFO: renamed from: a */
        void mo79459a();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel$b */
    /* JADX INFO: compiled from: AudioEffectPanel.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$initEarReturnVolume$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "i", "", "b", "", "onStartTrackingTouch", "onStopTrackingTouch", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35878b implements SeekBar.OnSeekBarChangeListener {
        public C35878b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean b11) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            TextView textView = AudioEffectPanel.this.f77600e;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textEarReturnVolume");
                textView = null;
            }
            textView.setText(String.valueOf(i11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            AudioEffectStore audioEffectStore = AudioEffectPanel.this.f77602g;
            if (audioEffectStore != null) {
                audioEffectStore.setVoiceEarMonitorVolume(seekBar.getProgress());
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel$c */
    /* JADX INFO: compiled from: AudioEffectPanel.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$initPeopleVolumeView$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "i", "", "b", "", "onStartTrackingTouch", "onStopTrackingTouch", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35879c implements SeekBar.OnSeekBarChangeListener {
        public C35879c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean b11) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            TextView textView = AudioEffectPanel.this.f77601f;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textPeopleVolume");
                textView = null;
            }
            textView.setText(String.valueOf(i11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkNotNullParameter(seekBar, "seekBar");
            DeviceStore deviceStore = AudioEffectPanel.this.f77603h;
            if (deviceStore != null) {
                deviceStore.setCaptureVolume(seekBar.getProgress());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudioEffectPanel(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudioEffectPanel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    public static final void m79447q(AudioEffectPanel audioEffectPanel, CompoundButton compoundButton, boolean z11) {
        AudioEffectStore audioEffectStore = audioEffectPanel.f77602g;
        if (audioEffectStore != null) {
            audioEffectStore.setVoiceEarMonitorEnable(z11);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m79448s(AudioEffectPanel audioEffectPanel, View view) {
        InterfaceC35877a interfaceC35877a = audioEffectPanel.f77604i;
        if (interfaceC35877a != null) {
            interfaceC35877a.mo79459a();
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: b */
    public void mo79409b(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        super.mo79409b(roomId);
        m79449v();
        m79450w(roomId);
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77602g = AudioEffectStore.INSTANCE.shared();
        this.f77603h = DeviceStore.INSTANCE.shared();
    }

    /* JADX INFO: renamed from: l */
    public final void m79451l() {
        View viewFindViewById = findViewById(R$id.tv_ear_return_volume);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77600e = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.tv_people_volume);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f77601f = (TextView) viewFindViewById2;
    }

    /* JADX INFO: renamed from: m */
    public final void m79452m() throws Exception {
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_change_voice);
        Context context = this.f77599d;
        AudioEffectStore audioEffectStoreShared = this.f77602g;
        if (audioEffectStoreShared == null) {
            audioEffectStoreShared = AudioEffectStore.INSTANCE.shared();
        }
        C46757b c46757b = new C46757b(context, audioEffectStoreShared);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f77599d, c46757b.getItemCount()));
        recyclerView.setAdapter(c46757b);
    }

    /* JADX INFO: renamed from: n */
    public final void m79453n() {
        AudioEffectState audioEffectState;
        InterfaceC41678w<Integer> earMonitorVolume;
        SeekBar seekBar = (SeekBar) findViewById(R$id.sb_ear_return_volume);
        AudioEffectStore audioEffectStore = this.f77602g;
        seekBar.setProgress((audioEffectStore == null || (audioEffectState = audioEffectStore.getAudioEffectState()) == null || (earMonitorVolume = audioEffectState.getEarMonitorVolume()) == null) ? 0 : earMonitorVolume.getValue().intValue());
        seekBar.setOnSeekBarChangeListener(new C35878b());
    }

    /* JADX INFO: renamed from: o */
    public final void m79454o() {
        AudioEffectState audioEffectState;
        InterfaceC41678w<Integer> earMonitorVolume;
        TextView textView = this.f77600e;
        Integer value = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textEarReturnVolume");
            textView = null;
        }
        AudioEffectStore audioEffectStore = this.f77602g;
        if (audioEffectStore != null && (audioEffectState = audioEffectStore.getAudioEffectState()) != null && (earMonitorVolume = audioEffectState.getEarMonitorVolume()) != null) {
            value = earMonitorVolume.getValue();
        }
        textView.setText(String.valueOf(value));
    }

    /* JADX INFO: renamed from: p */
    public final void m79455p() {
        AudioEffectState audioEffectState;
        InterfaceC41678w<Boolean> interfaceC41678wIsEarMonitorOpened;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R$id.sc_enable_ear);
        AudioEffectStore audioEffectStore = this.f77602g;
        boolean z11 = false;
        if (audioEffectStore != null && (audioEffectState = audioEffectStore.getAudioEffectState()) != null && (interfaceC41678wIsEarMonitorOpened = audioEffectState.isEarMonitorOpened()) != null && interfaceC41678wIsEarMonitorOpened.getValue().booleanValue()) {
            z11 = true;
        }
        switchCompat.setChecked(z11);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yc0.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                AudioEffectPanel.m79447q(this.f104212b, compoundButton, z12);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m79456r() {
        findViewById(R$id.tv_finish).setOnClickListener(new View.OnClickListener() { // from class: yc0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioEffectPanel.m79448s(this.f104211b, view);
            }
        });
    }

    public final void setOnBackButtonClickListener(@Nullable InterfaceC35877a interfaceC35877a) {
        this.f77604i = interfaceC35877a;
    }

    /* JADX INFO: renamed from: t */
    public final void m79457t() {
        DeviceState deviceState;
        InterfaceC41678w<Integer> captureVolume;
        DeviceState deviceState2;
        InterfaceC41678w<Integer> captureVolume2;
        TextView textView = this.f77601f;
        Integer value = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textPeopleVolume");
            textView = null;
        }
        DeviceStore deviceStore = this.f77603h;
        if (deviceStore != null && (deviceState2 = deviceStore.getDeviceState()) != null && (captureVolume2 = deviceState2.getCaptureVolume()) != null) {
            value = captureVolume2.getValue();
        }
        textView.setText(String.valueOf(value));
        SeekBar seekBar = (SeekBar) findViewById(R$id.sb_people_volume);
        DeviceStore deviceStore2 = this.f77603h;
        seekBar.setProgress((deviceStore2 == null || (deviceState = deviceStore2.getDeviceState()) == null || (captureVolume = deviceState.getCaptureVolume()) == null) ? 0 : captureVolume.getValue().intValue());
        seekBar.setOnSeekBarChangeListener(new C35879c());
    }

    /* JADX INFO: renamed from: u */
    public final void m79458u() throws Exception {
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_reverb);
        Context context = this.f77599d;
        AudioEffectStore audioEffectStoreShared = this.f77602g;
        if (audioEffectStoreShared == null) {
            audioEffectStoreShared = AudioEffectStore.INSTANCE.shared();
        }
        C46759d c46759d = new C46759d(context, audioEffectStoreShared);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f77599d, c46759d.getItemCount()));
        recyclerView.setAdapter(c46759d);
    }

    public /* synthetic */ AudioEffectPanel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: v */
    private final void m79449v() throws Exception {
        m79451l();
        m79456r();
        m79452m();
        m79458u();
        m79454o();
        m79457t();
        m79455p();
        m79453n();
    }

    /* JADX INFO: renamed from: w */
    private final void m79450w(String str) {
        if (!TextUtils.isEmpty(str) && StringsKt.startsWith$default(str, "voice_", false, 2, (Object) null)) {
            C45496e.m100464a(191015);
        } else {
            C45496e.m100464a(190017);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AudioEffectPanel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77599d = context;
        LayoutInflater.from(context).inflate(R$layout.audio_effect_layout_settings_panel, (ViewGroup) this, true);
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
    }
}
