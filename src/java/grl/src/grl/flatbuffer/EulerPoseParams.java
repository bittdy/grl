// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EulerPoseParams extends Table {
  public static EulerPoseParams getRootAsEulerPoseParams(ByteBuffer _bb) { return getRootAsEulerPoseParams(_bb, new EulerPoseParams()); }
  public static EulerPoseParams getRootAsEulerPoseParams(ByteBuffer _bb, EulerPoseParams obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public EulerPoseParams __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public grl.flatbuffer.Vector3d position() { return position(new grl.flatbuffer.Vector3d()); }
  public grl.flatbuffer.Vector3d position(grl.flatbuffer.Vector3d obj) { int o = __offset(4); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }
  public EulerRotation rotation() { return rotation(new EulerRotation()); }
  public EulerRotation rotation(EulerRotation obj) { int o = __offset(6); return o != 0 ? obj.__init(o + bb_pos, bb) : null; }

  public static void startEulerPoseParams(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(0, positionOffset, 0); }
  public static void addRotation(FlatBufferBuilder builder, int rotationOffset) { builder.addStruct(1, rotationOffset, 0); }
  public static int endEulerPoseParams(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

