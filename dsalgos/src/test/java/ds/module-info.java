open module ds {
  requires java.logging;
  requires org.mockito;
  requires net.bytebuddy.agent;
  requires transitive org.junit.jupiter.api;
  requires transitive org.junit.jupiter.params;
  requires transitive org.junit.platform.launcher;
  requires transitive org.junit.platform.commons;
  requires transitive org.junit.platform.engine;

  exports ds;
}
