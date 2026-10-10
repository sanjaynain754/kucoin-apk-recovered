package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.BattleInfo;
import io.trtc.tuikit.atomicxcore.api.live.BattleStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.V0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40085V0 {

    /* JADX INFO: renamed from: a */
    public final LiveCoreViewDefine.CoreState f89156a = new LiveCoreViewDefine.CoreState();

    /* JADX INFO: renamed from: b */
    public String f89157b = "";

    /* JADX INFO: renamed from: c */
    public InterfaceC41775x1 f89158c;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88467a(C40085V0 c40085v0, CoGuestStore coGuestStore, ContinuationImpl continuationImpl) {
        C40109j0 c40109j0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40109j0) {
            c40109j0 = (C40109j0) continuationImpl;
            int i11 = c40109j0.f89214c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40109j0.f89214c = i11 - Integer.MIN_VALUE;
            } else {
                c40109j0 = new C40109j0(c40085v0, continuationImpl);
            }
        } else {
            c40109j0 = new C40109j0(c40085v0, continuationImpl);
        }
        Object obj = c40109j0.f89212a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40109j0.f89214c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<LiveUserInfo>> applicants = coGuestStore.getCoGuestState().getApplicants();
            C40111k0 c40111k0 = new C40111k0(c40085v0);
            c40109j0.f89214c = 1;
            if (applicants.collect(c40111k0, c40109j0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88472b(C40085V0 c40085v0, BattleStore battleStore, ContinuationImpl continuationImpl) {
        C40122n0 c40122n0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40122n0) {
            c40122n0 = (C40122n0) continuationImpl;
            int i11 = c40122n0.f89248c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40122n0.f89248c = i11 - Integer.MIN_VALUE;
            } else {
                c40122n0 = new C40122n0(c40085v0, continuationImpl);
            }
        } else {
            c40122n0 = new C40122n0(c40085v0, continuationImpl);
        }
        Object obj = c40122n0.f89246a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40122n0.f89248c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> battleUsers = battleStore.getBattleState().getBattleUsers();
            C40124o0 c40124o0 = new C40124o0(c40085v0);
            c40122n0.f89248c = 1;
            if (battleUsers.collect(c40124o0, c40122n0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m88477c(C40085V0 c40085v0, CoHostStore coHostStore, ContinuationImpl continuationImpl) {
        C40048C0 c40048c0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40048C0) {
            c40048c0 = (C40048C0) continuationImpl;
            int i11 = c40048c0.f89096c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40048c0.f89096c = i11 - Integer.MIN_VALUE;
            } else {
                c40048c0 = new C40048C0(c40085v0, continuationImpl);
            }
        } else {
            c40048c0 = new C40048C0(c40085v0, continuationImpl);
        }
        Object obj = c40048c0.f89094a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40048c0.f89096c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> connected = coHostStore.getCoHostState().getConnected();
            C40050D0 c40050d0 = new C40050D0(c40085v0);
            c40048c0.f89096c = 1;
            if (connected.collect(c40050d0, c40048c0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public C40085V0() {
        Intrinsics.checkNotNullParameter(C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40138v0(this, null), 3, null), "<set-?>");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m88478d(C40085V0 c40085v0, DeviceStore deviceStore, ContinuationImpl continuationImpl) {
        C40077R0 c40077r0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40077R0) {
            c40077r0 = (C40077R0) continuationImpl;
            int i11 = c40077r0.f89146c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40077r0.f89146c = i11 - Integer.MIN_VALUE;
            } else {
                c40077r0 = new C40077R0(c40085v0, continuationImpl);
            }
        } else {
            c40077r0 = new C40077R0(c40085v0, continuationImpl);
        }
        Object obj = c40077r0.f89144a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40077r0.f89146c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> microphoneStatus = deviceStore.getDeviceState().getMicrophoneStatus();
            C40079S0 c40079s0 = new C40079S0(c40085v0);
            c40077r0.f89146c = 1;
            if (microphoneStatus.collect(c40079s0, c40077r0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88466a(C40085V0 c40085v0, BattleStore battleStore, ContinuationImpl continuationImpl) {
        C40113l0 c40113l0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40113l0) {
            c40113l0 = (C40113l0) continuationImpl;
            int i11 = c40113l0.f89220c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40113l0.f89220c = i11 - Integer.MIN_VALUE;
            } else {
                c40113l0 = new C40113l0(c40085v0, continuationImpl);
            }
        } else {
            c40113l0 = new C40113l0(c40085v0, continuationImpl);
        }
        Object obj = c40113l0.f89218a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40113l0.f89220c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<BattleInfo> currentBattleInfo = battleStore.getBattleState().getCurrentBattleInfo();
            C40120m0 c40120m0 = new C40120m0(c40085v0);
            c40113l0.f89220c = 1;
            if (currentBattleInfo.collect(c40120m0, c40113l0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88474b(C40085V0 c40085v0, CoHostStore coHostStore, ContinuationImpl continuationImpl) {
        C40044A0 c40044a0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40044A0) {
            c40044a0 = (C40044A0) continuationImpl;
            int i11 = c40044a0.f89088c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40044a0.f89088c = i11 - Integer.MIN_VALUE;
            } else {
                c40044a0 = new C40044A0(c40085v0, continuationImpl);
            }
        } else {
            c40044a0 = new C40044A0(c40085v0, continuationImpl);
        }
        Object obj = c40044a0.f89086a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40044a0.f89088c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> invitees = coHostStore.getCoHostState().getInvitees();
            C40046B0 c40046b0 = new C40046B0(c40085v0);
            c40044a0.f89088c = 1;
            if (invitees.collect(c40046b0, c40044a0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m88476c(C40085V0 c40085v0, CoGuestStore coGuestStore, ContinuationImpl continuationImpl) {
        C40060I0 c40060i0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40060I0) {
            c40060i0 = (C40060I0) continuationImpl;
            int i11 = c40060i0.f89119c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40060i0.f89119c = i11 - Integer.MIN_VALUE;
            } else {
                c40060i0 = new C40060I0(c40085v0, continuationImpl);
            }
        } else {
            c40060i0 = new C40060I0(c40085v0, continuationImpl);
        }
        Object obj = c40060i0.f89117a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40060i0.f89119c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<LiveUserInfo>> invitees = coGuestStore.getCoGuestState().getInvitees();
            C40062J0 c40062j0 = new C40062J0(c40085v0);
            c40060i0.f89119c = 1;
            if (invitees.collect(c40062j0, c40060i0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88465a(C40085V0 c40085v0, DeviceStore deviceStore, ContinuationImpl continuationImpl) {
        C40140w0 c40140w0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40140w0) {
            c40140w0 = (C40140w0) continuationImpl;
            int i11 = c40140w0.f89282c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40140w0.f89282c = i11 - Integer.MIN_VALUE;
            } else {
                c40140w0 = new C40140w0(c40085v0, continuationImpl);
            }
        } else {
            c40140w0 = new C40140w0(c40085v0, continuationImpl);
        }
        Object obj = c40140w0.f89280a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40140w0.f89282c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> cameraStatus = deviceStore.getDeviceState().getCameraStatus();
            C40142x0 c40142x0 = new C40142x0(c40085v0);
            c40140w0.f89282c = 1;
            if (cameraStatus.collect(c40142x0, c40140w0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88473b(C40085V0 c40085v0, CoGuestStore coGuestStore, ContinuationImpl continuationImpl) {
        C40052E0 c40052e0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40052E0) {
            c40052e0 = (C40052E0) continuationImpl;
            int i11 = c40052e0.f89104c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40052e0.f89104c = i11 - Integer.MIN_VALUE;
            } else {
                c40052e0 = new C40052E0(c40085v0, continuationImpl);
            }
        } else {
            c40052e0 = new C40052E0(c40085v0, continuationImpl);
        }
        Object obj = c40052e0.f89102a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40052e0.f89104c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> connected = coGuestStore.getCoGuestState().getConnected();
            C40054F0 c40054f0 = new C40054F0(c40085v0);
            c40052e0.f89104c = 1;
            if (connected.collect(c40054f0, c40052e0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m88475c(C40085V0 c40085v0, DeviceStore deviceStore, ContinuationImpl continuationImpl) {
        C40074P0 c40074p0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40074P0) {
            c40074p0 = (C40074P0) continuationImpl;
            int i11 = c40074p0.f89142c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40074p0.f89142c = i11 - Integer.MIN_VALUE;
            } else {
                c40074p0 = new C40074P0(c40085v0, continuationImpl);
            }
        } else {
            c40074p0 = new C40074P0(c40085v0, continuationImpl);
        }
        Object obj = c40074p0.f89140a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40074p0.f89142c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> cameraStatus = deviceStore.getDeviceState().getCameraStatus();
            C40076Q0 c40076q0 = new C40076Q0(c40085v0);
            c40074p0.f89142c = 1;
            if (cameraStatus.collect(c40076q0, c40074p0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88468a(C40085V0 c40085v0, CoHostStore coHostStore, ContinuationImpl continuationImpl) {
        C40144y0 c40144y0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40144y0) {
            c40144y0 = (C40144y0) continuationImpl;
            int i11 = c40144y0.f89289c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40144y0.f89289c = i11 - Integer.MIN_VALUE;
            } else {
                c40144y0 = new C40144y0(c40085v0, continuationImpl);
            }
        } else {
            c40144y0 = new C40144y0(c40085v0, continuationImpl);
        }
        Object obj = c40144y0.f89287a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40144y0.f89289c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<SeatUserInfo> applicant = coHostStore.getCoHostState().getApplicant();
            C40146z0 c40146z0 = new C40146z0(c40085v0);
            c40144y0.f89289c = 1;
            if (applicant.collect(c40146z0, c40144y0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88471b(C40085V0 c40085v0, DeviceStore deviceStore, ContinuationImpl continuationImpl) {
        C40064K0 c40064k0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40064K0) {
            c40064k0 = (C40064K0) continuationImpl;
            int i11 = c40064k0.f89127c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40064k0.f89127c = i11 - Integer.MIN_VALUE;
            } else {
                c40064k0 = new C40064K0(c40085v0, continuationImpl);
            }
        } else {
            c40064k0 = new C40064K0(c40085v0, continuationImpl);
        }
        Object obj = c40064k0.f89125a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40064k0.f89127c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<Boolean> interfaceC41678wIsFrontCamera = deviceStore.getDeviceState().isFrontCamera();
            C40066L0 c40066l0 = new C40066L0(c40085v0);
            c40064k0.f89127c = 1;
            if (interfaceC41678wIsFrontCamera.collect(c40066l0, c40064k0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88469a(C40085V0 c40085v0, LiveListStore liveListStore, ContinuationImpl continuationImpl) {
        C40056G0 c40056g0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40056G0) {
            c40056g0 = (C40056G0) continuationImpl;
            int i11 = c40056g0.f89112c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40056g0.f89112c = i11 - Integer.MIN_VALUE;
            } else {
                c40056g0 = new C40056G0(c40085v0, continuationImpl);
            }
        } else {
            c40056g0 = new C40056G0(c40085v0, continuationImpl);
        }
        Object obj = c40056g0.f89110a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40056g0.f89112c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LiveInfo> currentLive = liveListStore.getLiveState().getCurrentLive();
            C40058H0 c40058h0 = new C40058H0(c40085v0);
            c40056g0.f89112c = 1;
            if (currentLive.collect(c40058h0, c40056g0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88470a(C40085V0 c40085v0, LiveSeatStore liveSeatStore, ContinuationImpl continuationImpl) {
        C40081T0 c40081t0;
        c40085v0.getClass();
        if (continuationImpl instanceof C40081T0) {
            c40081t0 = (C40081T0) continuationImpl;
            int i11 = c40081t0.f89152c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40081t0.f89152c = i11 - Integer.MIN_VALUE;
            } else {
                c40081t0 = new C40081T0(c40085v0, continuationImpl);
            }
        } else {
            c40081t0 = new C40081T0(c40085v0, continuationImpl);
        }
        Object obj = c40081t0.f89150a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40081t0.f89152c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatInfo>> seatList = liveSeatStore.getLiveSeatState().getSeatList();
            C40083U0 c40083u0 = new C40083U0(c40085v0);
            c40081t0.f89152c = 1;
            if (seatList.collect(c40083u0, c40081t0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: a */
    public final void m88479a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        LiveData<String> liveData = this.f89156a.roomState.roomId;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
        ((MutableLiveData) liveData).setValue(liveInfo.getLiveID());
        LiveData<TUIRoomDefine.UserInfo> liveData2 = this.f89156a.roomState.ownerInfo;
        Intrinsics.checkNotNull(liveData2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>");
        ((MutableLiveData) liveData2).setValue(AbstractC40043A.m88426a(liveInfo.getLiveOwner()));
        LiveData<Integer> liveData3 = this.f89156a.roomState.maxCoGuestCount;
        Intrinsics.checkNotNull(liveData3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        ((MutableLiveData) liveData3).setValue(Integer.valueOf(liveInfo.getMaxSeatCount()));
    }
}
