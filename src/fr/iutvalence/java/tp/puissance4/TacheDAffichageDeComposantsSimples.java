package fr.iutvalence.java.tp.puissance4;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TacheDAffichageDeComposantsSimples implements Runnable {

	@Override
	public void run() {
		
		JFrame fenetreJButton = new JFrame("parti de puissance quatre");
		fenetreJButton.setSize(600, 300);
		
		// ligne de boutton jaune
		//JButton jButtonJaune = new JButton("bouton");
		//jButtonJaune.setIcon(new ImageIcon("imageIcon/p4_jaune.png"));
		
		//jButtonVide.setHorizontalTextPosition(SwingConstants.CENTER);
		
		
		// ajoute la ligne de boutton rouge
		fenetreJButton.getContentPane().setLayout(new GridLayout(1,7));
		for (int bouton=0;bouton<7; bouton++)
			fenetreJButton.getContentPane().add(new JButton(new ImageIcon("imageIcon/p4_rouge.png")));
		spliPan
		// affichage de la grille vide
		fenetreJButton.getContentPane().setLayout(new GridLayout(6,7));
		for (int ligne=0; ligne<7; ligne++)
			for(int colone=0; colone<6; colone++)
				fenetreJButton.getContentPane().add(new JLabel(new ImageIcon("imageIcon/p4_vide.png")));
		
		
		// permet a la fenetre d'etre visible
		fenetreJButton.setVisible(true);

	}

}
