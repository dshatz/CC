package pp.block6.cc.test;

import java.io.File;
import java.io.IOException;

import pp.iloc.Assembler;
import pp.iloc.Simulator;
import pp.iloc.model.Program;
import pp.iloc.parse.FormatException;

public class FibTest {
	
	public static void main(String[] args) throws FormatException, IOException {
		Assembler assembler = Assembler.instance();
		Program prog = assembler.assemble(new File("fib.iloc"));
		
		Simulator sim = new Simulator(prog);
		sim.run();
	}

}
