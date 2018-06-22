package com.netifi.proteus.demo.vowelcount.service.blocking;

@javax.annotation.Generated(
    value = "by Proteus proto compiler (version 0.7.13)",
    comments = "Source: vowelcount.proto")
public final class VowelCountServiceClient implements VowelCountService {
  private final com.netifi.proteus.demo.vowelcount.service.VowelCountServiceClient delegate;

  public VowelCountServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new com.netifi.proteus.demo.vowelcount.service.VowelCountServiceClient(rSocket);
  }

  public VowelCountServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new com.netifi.proteus.demo.vowelcount.service.VowelCountServiceClient(rSocket, registry);
  }

  public  io.netifi.proteus.BlockingIterable<com.netifi.proteus.demo.vowelcount.service.VowelCountResponse> countVowels(Iterable<com.netifi.proteus.demo.vowelcount.service.VowelCountRequest> messages) {
    return countVowels(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  public  io.netifi.proteus.BlockingIterable<com.netifi.proteus.demo.vowelcount.service.VowelCountResponse> countVowels(Iterable<com.netifi.proteus.demo.vowelcount.service.VowelCountRequest> messages, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.countVowels(reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(messages)), metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

}
