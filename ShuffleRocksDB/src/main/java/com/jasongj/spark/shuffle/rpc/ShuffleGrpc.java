package com.jasongj.spark.shuffle.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: shuffle.proto")
public final class ShuffleGrpc {

  private ShuffleGrpc() {}

  public static final String SERVICE_NAME = "ShuffleProtocol.Shuffle";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord,
      com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecord",
      requestType = com.jasongj.spark.shuffle.rpc.ShuffleRecord.class,
      responseType = com.jasongj.spark.shuffle.rpc.ShuffleResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord,
      com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordMethod() {
    io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord, com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordMethod;
    if ((getWriteRecordMethod = ShuffleGrpc.getWriteRecordMethod) == null) {
      synchronized (ShuffleGrpc.class) {
        if ((getWriteRecordMethod = ShuffleGrpc.getWriteRecordMethod) == null) {
          ShuffleGrpc.getWriteRecordMethod = getWriteRecordMethod = 
              io.grpc.MethodDescriptor.<com.jasongj.spark.shuffle.rpc.ShuffleRecord, com.jasongj.spark.shuffle.rpc.ShuffleResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ShuffleProtocol.Shuffle", "WriteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.ShuffleRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.ShuffleResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ShuffleMethodDescriptorSupplier("WriteRecord"))
                  .build();
          }
        }
     }
     return getWriteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord,
      com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecords",
      requestType = com.jasongj.spark.shuffle.rpc.ShuffleRecord.class,
      responseType = com.jasongj.spark.shuffle.rpc.ShuffleResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord,
      com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordsMethod() {
    io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.ShuffleRecord, com.jasongj.spark.shuffle.rpc.ShuffleResult> getWriteRecordsMethod;
    if ((getWriteRecordsMethod = ShuffleGrpc.getWriteRecordsMethod) == null) {
      synchronized (ShuffleGrpc.class) {
        if ((getWriteRecordsMethod = ShuffleGrpc.getWriteRecordsMethod) == null) {
          ShuffleGrpc.getWriteRecordsMethod = getWriteRecordsMethod = 
              io.grpc.MethodDescriptor.<com.jasongj.spark.shuffle.rpc.ShuffleRecord, com.jasongj.spark.shuffle.rpc.ShuffleResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ShuffleProtocol.Shuffle", "WriteRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.ShuffleRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.ShuffleResult.getDefaultInstance()))
                  .setSchemaDescriptor(new ShuffleMethodDescriptorSupplier("WriteRecords"))
                  .build();
          }
        }
     }
     return getWriteRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.RecordIdentifier,
      com.jasongj.spark.shuffle.rpc.ShuffleRecord> getReadRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadRecords",
      requestType = com.jasongj.spark.shuffle.rpc.RecordIdentifier.class,
      responseType = com.jasongj.spark.shuffle.rpc.ShuffleRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.RecordIdentifier,
      com.jasongj.spark.shuffle.rpc.ShuffleRecord> getReadRecordsMethod() {
    io.grpc.MethodDescriptor<com.jasongj.spark.shuffle.rpc.RecordIdentifier, com.jasongj.spark.shuffle.rpc.ShuffleRecord> getReadRecordsMethod;
    if ((getReadRecordsMethod = ShuffleGrpc.getReadRecordsMethod) == null) {
      synchronized (ShuffleGrpc.class) {
        if ((getReadRecordsMethod = ShuffleGrpc.getReadRecordsMethod) == null) {
          ShuffleGrpc.getReadRecordsMethod = getReadRecordsMethod = 
              io.grpc.MethodDescriptor.<com.jasongj.spark.shuffle.rpc.RecordIdentifier, com.jasongj.spark.shuffle.rpc.ShuffleRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ShuffleProtocol.Shuffle", "ReadRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.RecordIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.jasongj.spark.shuffle.rpc.ShuffleRecord.getDefaultInstance()))
                  .setSchemaDescriptor(new ShuffleMethodDescriptorSupplier("ReadRecords"))
                  .build();
          }
        }
     }
     return getReadRecordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShuffleStub newStub(io.grpc.Channel channel) {
    return new ShuffleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShuffleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShuffleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShuffleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShuffleFutureStub(channel);
  }

  /**
   */
  public static abstract class ShuffleImplBase implements io.grpc.BindableService {

    /**
     */
    public void writeRecord(com.jasongj.spark.shuffle.rpc.ShuffleRecord request,
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteRecordMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleRecord> writeRecords(
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult> responseObserver) {
      return asyncUnimplementedStreamingCall(getWriteRecordsMethod(), responseObserver);
    }

    /**
     */
    public void readRecords(com.jasongj.spark.shuffle.rpc.RecordIdentifier request,
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleRecord> responseObserver) {
      asyncUnimplementedUnaryCall(getReadRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.jasongj.spark.shuffle.rpc.ShuffleRecord,
                com.jasongj.spark.shuffle.rpc.ShuffleResult>(
                  this, METHODID_WRITE_RECORD)))
          .addMethod(
            getWriteRecordsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.jasongj.spark.shuffle.rpc.ShuffleRecord,
                com.jasongj.spark.shuffle.rpc.ShuffleResult>(
                  this, METHODID_WRITE_RECORDS)))
          .addMethod(
            getReadRecordsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.jasongj.spark.shuffle.rpc.RecordIdentifier,
                com.jasongj.spark.shuffle.rpc.ShuffleRecord>(
                  this, METHODID_READ_RECORDS)))
          .build();
    }
  }

  /**
   */
  public static final class ShuffleStub extends io.grpc.stub.AbstractStub<ShuffleStub> {
    private ShuffleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShuffleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShuffleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShuffleStub(channel, callOptions);
    }

    /**
     */
    public void writeRecord(com.jasongj.spark.shuffle.rpc.ShuffleRecord request,
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleRecord> writeRecords(
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getWriteRecordsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void readRecords(com.jasongj.spark.shuffle.rpc.RecordIdentifier request,
        io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleRecord> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReadRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShuffleBlockingStub extends io.grpc.stub.AbstractStub<ShuffleBlockingStub> {
    private ShuffleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShuffleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShuffleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShuffleBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jasongj.spark.shuffle.rpc.ShuffleResult writeRecord(com.jasongj.spark.shuffle.rpc.ShuffleRecord request) {
      return blockingUnaryCall(
          getChannel(), getWriteRecordMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.jasongj.spark.shuffle.rpc.ShuffleRecord> readRecords(
        com.jasongj.spark.shuffle.rpc.RecordIdentifier request) {
      return blockingServerStreamingCall(
          getChannel(), getReadRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShuffleFutureStub extends io.grpc.stub.AbstractStub<ShuffleFutureStub> {
    private ShuffleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShuffleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShuffleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShuffleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jasongj.spark.shuffle.rpc.ShuffleResult> writeRecord(
        com.jasongj.spark.shuffle.rpc.ShuffleRecord request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE_RECORD = 0;
  private static final int METHODID_READ_RECORDS = 1;
  private static final int METHODID_WRITE_RECORDS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShuffleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShuffleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE_RECORD:
          serviceImpl.writeRecord((com.jasongj.spark.shuffle.rpc.ShuffleRecord) request,
              (io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult>) responseObserver);
          break;
        case METHODID_READ_RECORDS:
          serviceImpl.readRecords((com.jasongj.spark.shuffle.rpc.RecordIdentifier) request,
              (io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleRecord>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE_RECORDS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeRecords(
              (io.grpc.stub.StreamObserver<com.jasongj.spark.shuffle.rpc.ShuffleResult>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ShuffleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShuffleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jasongj.spark.shuffle.rpc.ShuffleProtocol.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Shuffle");
    }
  }

  private static final class ShuffleFileDescriptorSupplier
      extends ShuffleBaseDescriptorSupplier {
    ShuffleFileDescriptorSupplier() {}
  }

  private static final class ShuffleMethodDescriptorSupplier
      extends ShuffleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShuffleMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShuffleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShuffleFileDescriptorSupplier())
              .addMethod(getWriteRecordMethod())
              .addMethod(getWriteRecordsMethod())
              .addMethod(getReadRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
