package movePoo;

public class MovableRectangle implements Movable{
	private MovablePoint pontoSuperiorEsquerdo;
	private MovablePoint pontoInferiorDireito;
	
	public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
		pontoSuperiorEsquerdo = new MovablePoint(x1,y1,xSpeed,ySpeed);
		pontoInferiorDireito = new MovablePoint(x2,y2,xSpeed,ySpeed);
	}
	
	@Override
	public void moveUp() {
		
		pontoSuperiorEsquerdo.y += pontoSuperiorEsquerdo.ySpeed;
		pontoInferiorDireito.y+=pontoInferiorDireito.ySpeed;
	}

	@Override
	public void moveDown() {
		pontoSuperiorEsquerdo.y -= pontoSuperiorEsquerdo.ySpeed;
		pontoInferiorDireito.y -= pontoInferiorDireito.ySpeed;
	}

	@Override
	public void moveLeft() {
		pontoSuperiorEsquerdo.x -= pontoSuperiorEsquerdo.xSpeed;
		pontoInferiorDireito.x-= pontoInferiorDireito.xSpeed;
	}

	@Override
	public void moveRight() {
		pontoSuperiorEsquerdo.x += pontoSuperiorEsquerdo.xSpeed;
		pontoInferiorDireito.x += pontoInferiorDireito.xSpeed;
	}

}
