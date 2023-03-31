open module ds {
  requires java.logging;

  exports ds;

  requires org.mockito;
  requires transitive org.junit.jupiter.api;
  requires transitive org.junit.jupiter.params;
  requires transitive org.junit.platform.launcher;
  requires transitive org.junit.platform.commons;
  requires transitive org.junit.platform.engine;

  exports ds.tests;
}